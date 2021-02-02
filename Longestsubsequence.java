package programs;

public class Longestsubsequence {

	public static void main(String[] args) {
		
		int[] arr = {10,22,9,33,21,50,41,60};
		
		int n= arr.length;
		
		int[] sq = new int[n];
		int i, mx=0;
		for(i=0; i<n; i++) {
			sq[i]= 1;	
		}
		
		for(i=1 ;i<n;i++) {
			for(int j=0; j<i ;j++) {
				if(arr[i]> arr[j]) {
					if(sq[i]< sq[j]+1) {
						sq[i]= sq[j]+1;
					}
				}
			}
		}
		for(i=0; i<n; i++) {
			if(sq[i]> mx) {
				mx= sq[i];
			}
			//System.out.print(sq[i] + " ");	
		}
		System.out.println(mx);
	}

}
