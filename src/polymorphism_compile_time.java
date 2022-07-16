public class polymorphism_compile_time {

	
	void add()
	{
		int a=10; int b=20;int c;
		c=a+b;
		//return c;                                           for return first change the method type from void to int.
		System.out.println(c);
		
	}
	
		void add(int x,int y) {
			int c;
			c=x+y;
			System.out.println(c);
		}
		
		void add(int x,double y) 
		{double c;
			c=x+y;
			System.out.println(c);
		}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism_compile_time y=new polymorphism_compile_time();
      y.add(100,200);   y.add(41,5);/* int x=*/ y.add();
    //  System.out.println (x);
	}

}
