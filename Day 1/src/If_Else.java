import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int i = sc.nextInt();
		if(i<=33)
		{
			System.out.println("Fail");
		}
		else if(i>33 && i<=50)
		{
			System.out.println("Pass");
		}
		else if(i>50 && i<=60)
		{
			System.out.println("Second class");
		}
		else if(i>60 && i<=65)
		{
			System.out.println("First class");
		}
		else if(i>65 && i<=75)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}
}
