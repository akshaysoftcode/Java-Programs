package programs;

public class maxrow {
	public static void main(String args[]) {
		
		int mat[][]= {{1,2,3},
				{7,8,9},
				{4,5,6},
				};
		int max= Integer.MIN_VALUE;
		int idx= -1;
		for(int i=0;i<mat.length;i++) {
			int rsum=0;
			for(int j=0;j<mat.length;j++) {
				rsum+= mat[i][j];
				
			}
			if (max< rsum)
			{
				max= rsum;
				idx=i;
			}
		}
		
		System.out.println("Row " + (idx+1) +" has max sum :"+ max);
		
		
	}
}
