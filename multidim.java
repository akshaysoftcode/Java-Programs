import java.util.Scanner;

public class multidim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no .of rows");
		int x= sc.nextInt();
		System.out.println("enter colmnss");
		int y=sc.nextInt();
		
		
		int[][] grid=new int[x][y];
		
		for(int row=0;row<x;row++)
		{
			for(int col=0;col<y;col++)
			{
				System.out.println("enter interger");
				grid[row][col]= sc.nextInt();
			}
		}
		
		System.out.println("your matrix is");
		for(int row=0;row<grid.length;row++)
		{
			for(int col=0;col<grid[row].length;col++)
			{
				System.out.print(grid[row][col]+ "  ");
			}
			System.out.println();
		}
	}

}
