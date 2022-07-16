import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.print("Enter any number");
		Scanner obj=new Scanner (System.in);
		num=obj.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			
		System.out.println(num*i);
		
		}
		
		
	}

}
