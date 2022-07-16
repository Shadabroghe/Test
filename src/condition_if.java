import java.util.Scanner;

public class condition_if {

	public static void main(String[] args) {
		

		int pwd;
		System.out.println("Enter Password");
		Scanner obj=new Scanner(System.in);
		
		
		pwd=obj.nextInt();
		if (pwd==786)
		{
			System.out.println("Password is correct you are login now");
			
		}
		else
		{
			
			
			System.out.println("Password is incorrect");
			
		}
	}

}
