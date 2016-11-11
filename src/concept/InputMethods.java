package concept;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://tutorials.jenkov.com/java-io/bufferedreader.html
 */

public class InputMethods {

	public static void main(String[] args) {
			int n = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			n = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(n);
	}
}