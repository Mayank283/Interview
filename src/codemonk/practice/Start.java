package codemonk.practice;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testcases, i = 0, j = 0;
		
		testcases = in.nextInt();
		
		int number[] = new int[testcases];
		int choices[] = new int[testcases];
		int values[];
			
		for(i=0;i<testcases;i++) {

			number[i] = in.nextInt();
			choices[i] = in.nextInt();

			values = new int[number[i]];
			
			for (j = 0; j < number[i]; j++)
				values[j] = in.nextInt();
		}
		in.close();
	}
}