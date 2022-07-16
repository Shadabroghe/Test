
public class Constructor_Basic {

	
	int a; String name;
	Constructor_Basic()        //name of the class is name of the constructor
	{
		a=5;name="shadab";      //intialization of instant variable in construtor.
		 
	}
	
	void show()                //making method for output
	{
		System.out.print(a+ " "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Basic t=new Constructor_Basic(); //making object
		t.show();    //this is for method(calling).
		//no need to type extra t.a because of constructor.
		
	}

}
