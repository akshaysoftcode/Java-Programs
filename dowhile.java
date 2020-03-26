import java.util.Scanner;

public class dowhile {
	public static void  main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	
	/*
	System.out.println("enter no");
	int value= scan.nextInt();
	
	while(value!=10)
	{  value= scan.nextInt();
		
	}*/
	
	
	int value;
	do {
		System.out.println("enter no");
		 value= scan.nextInt();
	}
	while(value!= 10);
System.out.println("out");
	}
}
