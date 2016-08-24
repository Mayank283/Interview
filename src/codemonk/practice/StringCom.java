package codemonk.practice;

public class StringCom {

	public static void main(String[] args) {

		int k = 3;
		char[] set = { 'a', 'b'};
		printCombination(set, k);
	}

	public static void printCombination(char[] set, int k) {
		char[] ch = new char[k];
		int index = 0;
		combination(set, k, index, ch);
	}

	public static void combination(char[] set, int k,int index, char[] ch) {
		if (index == k) {
			System.out.println(new String(ch));
			return;
		}

		for (int i = 0; i < set.length; i++) {
			ch[index] = set[i];
			combination(set, k,index+1,ch);
		}
	}
}