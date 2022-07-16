import java.util.Scanner;

public class codition_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//odd number even number using while loop
		int num;
		
	System.out.println("Enter any number=");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	
	while(num>=0)
		
		if(num%2==0)
			
		{
			System.out.println("even number");
			break;
		}
	
		else
		{
			System.out.println("odd number");
			break;
			
		}
	
		
		
	}

}
