package programs;

public class Prog {

	public static void main(String[] args) {
		int n =5;
		int[] arr = {3,1,43,2,5};
		int[] c = new int[n];
		
		for(int i=1 ; i<=n ; i++) {
			int cn=0;
			for(int j=0 ; j<n ;j++)	{
				if(i==arr[j]) {
					c[i-1]= cn+1;
				}
				
			}
			
		}
		
		for(int i=0 ; i<n ;i++) {
			if(c[i]==0) {
				i=i+1;
				System.out.println("no found "+ i);
			}
		}
	}

}
