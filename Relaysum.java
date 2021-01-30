package programs;

import java.util.Scanner;

public class Relaysum {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sums=0;
	int[] a= new int[n] ;
	int[] b= new int[n] ;

	for(int i = 0;i<n;i++)
	{
		a[i] = sc.nextInt();
	}
	int sum = 0;
	
	for(int i = 0;i<n;i++)
	{
		sum = sum + a[i];	
			b[i]= sum;	
	}
	for(int i = 0;i<n;i++) {
		 sums += b[i];
	}

	for(int i = 0;i<n;i++)
	{
		System.out.print(b[i]);
	}
	
	System.out.println("\n"+sums);
}
}

