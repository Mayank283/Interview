package companies.oyo;

import java.util.Stack;

/**
 *
 */
public class BalancedParanthesis
{
    public static void main(String[] args)
    {
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        String paranthesis = "{()[][{()}}";
        System.out.println(balancedParanthesis.isBalanced(paranthesis));
    }

    private boolean isBalanced(String paranthesis)
    {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int size = paranthesis.length();
        while (i < size)
        {
            char bracket = paranthesis.charAt(i);
            switch (bracket)
            {
            case '(':
                stack.push(bracket);
                break;
            case ')':
                if (stack.peek().equals('('))
                {
                    stack.pop();
                } else
                {
                    return false;
                }
                break;
            case '{':
                stack.push(bracket);
                break;
            case '}':
                if (stack.peek().equals('{'))
                {
                    stack.pop();
                } else
                {
                    return false;
                }
                break;
            case '[':
                stack.push(bracket);
                break;
            case ']':
                if (stack.peek().equals('['))
                {
                    stack.pop();
                } else
                {
                    return false;
                }
                break;
            default:
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
