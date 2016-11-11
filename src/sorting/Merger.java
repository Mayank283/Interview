/**
 * 
 */
package sorting;

/**
 * @author Mayank
 *
 */
public class Merger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 20 };
		int[] b = { 2 };

		Merge(a, b);
	}

	public static void Merge(int a[], int b[]) {
		int i = 0, j = 0, k = 0;
		int[] c = new int[a.length + b.length];

		while (i < a.length && j < b.length) {
			
			if (a[i] > b[j])
				c[k++] = b[j++];

			else
				c[k++] = a[i++];
		}

		if (i < a.length) {
			while (i < a.length)
				c[k++] = a[i++];

		} else {
			while (j < b.length)
				c[k++] = b[j++];
		}

		for (int l = 0; l < c.length; l++) {
			System.out.print(c[l] + " ");
		}
	}
	
	public static void mergesort(int[] a,int start,int end){
		int mid;
		if (start<end) {
			
			mid=(start+end)/2;
			mergesort(a,start,mid);
			mergesort(a,mid+1,end);
			
		} 	
	}
}