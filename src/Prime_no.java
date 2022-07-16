import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,count=0;
		System.out.print("Enter any number=");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		for(int i=1; i<=n; i++) 
		{
			if(n%i==0) {
			count++;
			}
			}
		if(count==2) {
			System.out.print("Prime number");	
		}
		
		else {
			
			System.out.print("non prime number");
		}
		
		
		}}
