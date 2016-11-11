package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Statistics1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length=in.nextInt();
        int [] values = new int[length];
        int sum=0;
        double mean,median;
        for(int i=0;i<length;i++){
            values[i]=in.nextInt();
            sum=sum+values[i];
        }
        Arrays.sort(values);
        /**Mean*/
        mean = sum/(double)length;
        System.out.println(String.format("%.1f", mean));
        
        /**Median*/
        if(length%2==1){
        	median=values[length/2];
        }
        else {
        	median = (values[length/2]+values[(length/2)-1])/(double)2;
        }
        System.out.println(String.format("%.1f", median));
        
        /**Mode*/
        int c=1,cmax=1,v=0;
        
        for(int i=1; i<length;i++){
        	if(values[i]!=values[i-1]){
        		c=1;
        	}
        	else {
        		c++;
        	}
        	if (c>cmax){
        		cmax=c;
        		v=i;
        	}
        }
        System.out.println(values[v]);
        in.close();
    }
}