

                    //parametrized_constructor
public class A {

	int x,y,r,s;
	A(int a,int b)    //
	{
		x=a; y=b;
	}
	A(int a, String t)
	
	{
		System.out.println(a+"\n"+t);
	}
	void show()
	
	{
		System.out.println(x+"\n"+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A r=new A(1500,6500); 
		A ref=new A(9500,"shadab");//input value			`++	
		r.show();
		
		
		
	}

}
