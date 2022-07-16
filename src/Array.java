import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		int a[][]=new int[2][2];
		System.out.print("Enter array element=");
		Scanner t=new Scanner (System.in);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=t.nextInt();
				
			}
			
			
		}
		
		System.out.print("Matrix element=\n");   // for output purpose
		
		for(int i=0;i<2;i++)       //output without for each loop for matrix array with same for loop only in statement changes occur.
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println("");
		
		
		
		}
	}
}


 



