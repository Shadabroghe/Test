

                                 //single Inheritance


class student{                    //super class
	protected int rollnum,marks;         //if private is used than we didn't get output
	String name;
	protected void input()
	{
		System.out.println("enter rollnum,name,marks");
	}
}


public class shadab extends student {    //sub class
	void display()
	{
		rollnum=91; marks=89; name="shahbaz";
		System.out.println(rollnum+" " +marks+" "+name);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shadab s=new shadab();
		s.input();
		s.display();
		
	}

}
