import java.util.Scanner;

public class codition_nest_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		System.out.println("Enter the first number=");
		System.out.println("Enter the second number=");
		System.out.println("Enter the third number=");
		Scanner obj=new Scanner(System.in);
		num1=obj.nextInt();
		num2=obj.nextInt();
		num3=obj.nextInt();
		
		if(num1>num2)
		{
		
		if(num1>num3)
			
		{
			System.out.println("This is the largest number"+num1);
		}
		
		else
		{
			System.out.println("This is the largest number"+num3);
		}
		}
		
		else
		{
		if(num2>num3)
		{
			System.out.println("This is the largest number"+num2);
			}
		else
		{System.out.println("This is the largest number"+num3);
		}
		
		}
		
		
	}

}
