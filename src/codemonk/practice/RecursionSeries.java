/**
 * Learning method for recursive function:
 * First, decide on the terminating condition.
 * Second, build your logic above and below the terminating condition.
 * */

package codemonk.practice;

public class RecursionSeries {

	public static void main(String[] args) {
		int n = 16;
		series(n);
	}
	
	public static void series(int n){
		System.out.print(n+" ");
		
		if(n<=0){
			return;
		}
		series(n-5);
		
		System.out.print(n+" ");
	}
}