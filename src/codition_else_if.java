import java.util.Scanner;

public class codition_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter marks=");
		Scanner obj=new Scanner(System.in);
		
		num=obj.nextInt();
		
		if(num>=75 && num<=100)
		{
			
		System.out.println("Pass with A Distinction");
	
		}
		else if(num>=60 && num<=75)
		{
		System.out.println("Pass with B grade");
		}
		else if(num>=35 && num<=60)
		{
			System.out.println("Pass with C grade");
		}
		else if(num<=35)
		
		{
			System.out.println("Failled");
		}
		
		
		
	}

}
