import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		int a,b,ca;
		System.out.print("Enter number a=");
		Scanner t=new Scanner (System.in);
		a=t.nextInt();
		System.out.print("Enter number b=");
		b=t.nextInt();
		System.out.print("Enter what you want to calculate=");
		ca=t.nextInt();
		

		switch(ca)
		{
		
		case 1:
		c=a+b;
		System.out.print(c);
		break;
			case 2:
 		c=a-b;
		System.out.print("answer is="+c);
		break;
			case 3:
			c=a*b;
			System.out.print("answer is="+c);
			break;
		case 4:
		c=a/b;
		System.out.print("answer is="+c);
		break;
		case 5:
		c=a%b;
		System.out.print("answer is="+c);
		break;
	
			default:
		System.out.print("wrong calculation");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		}
		
}
