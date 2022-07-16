class Ab{
	
	void input()
	{
		System.out.println("What is your name?");
	}
}
class Bc extends Ab
{
	void disp() {

		System.out.println("My name is Shadab");
	}
	
}
class Cd extends Ab{
	
	void disp()
	{

		System.out.println("My name is Sundus");
	}
	
}


public class hirarchical_inharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cd q=new Cd();      q.input();q.disp();
		Bc e=new Bc();      e.input(); e.disp();
		
		
		
	}

}
