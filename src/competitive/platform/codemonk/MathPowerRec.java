package competitive.platform.codemonk;

public class MathPowerRec {

	public static void main(String[] args) {
		int n =2;
		int p =0;
		long result = power(n,p);
		System.out.println(result);
	}

	public static long power(int n, int p){
		
		if(p==0){
			return 1;
		}	
		return (n*power(n,p-1));
	}
}