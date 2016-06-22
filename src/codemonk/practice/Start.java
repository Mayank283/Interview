package codemonk.practice;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, i = 0, j = 0;
		t = in.nextInt();
		int n[] = new int[t];
		int k[] = new int[t];

		while (t-- > 0) {
			n[i++] = in.nextInt();
			k[j++] = in.nextInt();
		}

		for (i = 0; i < n.length; i++) {

			int v[] = new int[n[i]];

			for (j = 0; j < n[i]; j++) {
				v[j] = in.nextInt();
			}
			// call the method here and store result in resultarray;
		}
		in.close();
	}

	public static void maximumCheese(int v[]) {
		
		int count=0,sum=0,max=0;
		
		for (int j = 0; j < v.length; j++) {

			int n = v[j];
			
			while (n>0)
			{
				n = n & (n - 1);
				count++;
			}
			sum=sum+count;
			if (max<sum){
				max=sum;
			}
		}
	}
}