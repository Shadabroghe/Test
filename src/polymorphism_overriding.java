


class shape{
	
	void draw()                          //method name is different in super class than we get compiler error.
	{
		System.out.println("dont know the shape");
	}
}
class square extends shape{
	
	@Override
	void draw()                                        //method name is same than output is from sub class.         //method name is different in sub class than super class behaviour will print.
	{ // super.draw();                           //extra for super class
		System.out.println("Square shape");
	}
}

public class polymorphism_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		shape g=new square();
		g.draw();
	}

}
