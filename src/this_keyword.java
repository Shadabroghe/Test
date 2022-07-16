
//===============================this keyword refer to current object======================
/*
class G
{
	void show()     //for first example this keyword example to refer same object inside method
	{
		
	System.out.println(this);
}
}
*/

//========================================================================================================
class H
//{int a=60;
{
H()
{
	this(30);    //for fourth example we initialize the perametrize constructor using this keyword. x
	//System.out.println("i love u");
	}
H(int a)          
{
    // this.a=a; //for second example diffrentiate between local and instance variable.
//this();          //for third example if this keyword is present in first line of parametrise constructor than it by default print value of default constructor. 
/*}

void show()
{*/
System.out.println(a);
	}
}



public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*G r=new G();
		System.out.println(r);   //for first example
		r.show();*/
		//H t=new H(90); //for second example and third example
		H t=new H();    //for fourth example.
		//t.show();
		
		
		
	}

}
