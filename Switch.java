import java.util.Scanner;

public class Switch {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("enter command:");
		
		String value= input.nextLine();
		
		switch (value)
		{
		case "1":
			System.out.println("you chose 1");
			break;
			
		case "2":
			System.out.println("you chose 2");
			break;
			
		case "3":
			 System.out.println("you chose 3");
			 break;
			 
		default:
			System.out.println("command not recognised");
			
			
		}
		
	}

}
