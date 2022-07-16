

                    //Copy Constructor


public class B {

	int age;
	String name;
	
	B()
	{
		age=26; name="shadab";
		System.out.println(name+" "+age);
		
	}
	
	B(B S)     //S is copy element for copy constructor.
	{
		age=S.age;   name=S.name;
		System.out.println(name+" "+age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B c=new B();
		B d=new B(c);	
		
	}

}

  
