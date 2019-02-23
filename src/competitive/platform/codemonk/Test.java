package competitive.platform.codemonk;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// int a = Integer.parseInt(in.readLine());
		// int b = Integer.parseInt(in.readLine());
		// String s = in.readLine();
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(s);
		// System.out.write(b);
		// PrintStream p = new PrintStream(System.out, true);
		// p.println(a);
		// PrintWriter pw = new PrintWriter(System.out, true);
		// pw.println(b);
		// pw.flush();
		// Scanner sc =new Scanner(System.in);
		// int c = sc.nextInt();
		// int d = sc.nextInt();
		// System.out.println(c);
		// System.out.println(d);
		//
		BufferedInputStream in = new BufferedInputStream(System.in);
		int h = in.read();
		System.out.println(h);
		
	}

}
