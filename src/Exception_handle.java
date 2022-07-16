
public class Exception_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("main method started");
int a=20;int b=0;int c;
try 
{
	c=a/b;
	System.out.println(c);
}
	catch(Exception e) {                                 //Arithmetic Exception for arithmetic operation.
		
		System.out.println(e);
	}	
System.out.println("main method ended");
		
	}

}
