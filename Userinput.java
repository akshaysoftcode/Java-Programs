import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object
		Scanner input= new Scanner(System.in);
		
		// output prompt
		System.out.println("enter Float value");
		
		//enter float value
		double value= input.nextDouble();
		
		//output
		System.out.println("you entered:"+ value);
	}

}
