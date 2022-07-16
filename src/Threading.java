import java.io.IOException;

class farhan extends Thread

{
	public void run()
	{
	try {
	for (int i=1;i<=5;i++)
	{
	System.out.println("I love u Sundus");
	Thread.sleep(10000);	
	}
	}
	catch(Exception e)
	{
		}
	
}

}
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
farhan t=new farhan();
//Thread c=new Thread(t);
t.start();

	for (int i=1;i<=5;i++)
	{
		System.out.println("I love u Shadab");
	Thread.sleep(1000);
	}
	
		
		
	}

}
