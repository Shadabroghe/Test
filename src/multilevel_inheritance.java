class J{
	
	void add()
	{
		int a=20;
	int b=5;
	int c;
		c=a+b;
				System.out.println("addition of two number is="+c);
				
}
	void sub()
	{
		int a=300;
	int b=50;
	int c;
		c=a-b;
				System.out.println("sub  of two number is="+c);
				
}
	
}
class K extends J
{
	void multi()
	{
		int a=20;
	int b=5;
	int c;
		c=a*b;
				System.out.println("multiplication of two number is="+c);
				
}
	void divide()
	{
		int a=20;
	int b=5;
	int c;
		c=a/b;
				System.out.println("division of two number is="+c);
				
}
	
}
class L extends K{
	
	void reminder()
	{
		int a=20;
	int b=5;
	int c;
		c=a%b;
				System.out.println("reminder of two number is="+c);
				
}
}





public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		L f=new L();
f.add();f.sub();f.multi();f.divide();f.reminder();
	}

}
