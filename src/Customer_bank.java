import java.util.Scanner;

class Union

{
	private int Balance=500;
	private int Pwd=1234;
	int pwd1;
	int Bal;
	int b;

	/*public void Security()
	{
	System.out.println("Please enter new pwd");
	Scanner t=new Scanner (System.in);
	pwd1=t.nextInt();
	Pwd=pwd1;
	System.out.println("new password="+Pwd);
		}
	*/

			
		public void Deposite()
		{
System.out.println("Please enter pwd");
	       Scanner w=new Scanner (System.in);
	        Pwd=w.nextInt();
		if (Pwd==1234)
		{
              
			System.out.println("Please enter amount=");
			Scanner t=new Scanner (System.in);
			b=t.nextInt();
			Bal=b+Balance;
			System.out.println("New Balance is="+Bal);
		}
		
else
			
		{
			
			System.out.println("Wrong Password");
		}
}
	
		public void Withdrawl()
		{
System.out.println("Please enter pwd");
	       Scanner w=new Scanner (System.in);
	        Pwd=w.nextInt();
		if (Pwd==1234)
		{
			System.out.println("Please enter amount=");
			Scanner t=new Scanner (System.in);
			b=t.nextInt();
			Bal=Balance-b;
			System.out.println("New Balance is="+Bal);
		}
		
else
			
		{
			
			System.out.println("Wrong Password");
		}}
		public void Balance()
		{
System.out.println("Please enter pwd");
	       Scanner w=new Scanner (System.in);
	        Pwd=w.nextInt();
		if (Pwd==1234)
		{
			System.out.println("Balance="+Balance);
		}
else
			
		{
			
			System.out.println("Wrong Password");
		}}
		public void change_pwd() {
System.out.println("Please enter pwd");
	       Scanner w=new Scanner (System.in);
	        Pwd=w.nextInt();
		if (Pwd==1234)
		{
			System.out.println("Please enter new pwd=");
			Scanner t=new Scanner (System.in);
			pwd1=t.nextInt();
			System.out.println("new pwd="+pwd1);
		}
	
		else
			
		{
			
			System.out.println("Wrong Password");
		}
}
}
		
	
	
public class Customer_bank {

	public static void main(String[] args) {
		

		
		Union r=new Union();
		
		int a;
		System.out.println("press 1 for deposte");
		System.out.println("press 2 for withdrawl");
		System.out.println("press 3 for balance");
		System.out.println("press 4 for change_pwd");
		Scanner s=new Scanner (System.in);
		a=s.nextInt();
		
		switch(a)
		{
		
		case 1:r.Deposite();
		break;
		case 2:r.Withdrawl();
		break;
		case 3:r.Balance();
		break;
		case 4:r.change_pwd();
		break;	
		}

	}

}
