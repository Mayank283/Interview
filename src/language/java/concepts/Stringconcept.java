package language.java.concepts;

public class Stringconcept {

	public static void main(String[] args) {

		String[] a = { "M", "a", "y", "a", "n", "k" };
		
		String b="Mayank";
		
		char [] c=b.toCharArray();

		/* For:each can only iterate over an array or an instance of java.lang.Iterable **/
		
		for (String d : a) {
			System.out.print(d);
		}
		
		for(char n : c){
			System.out.print(n);
		}
		
		int i = 0;
		while (i < a.length) {
			System.out.print(a[i++]);
		}

	}

}