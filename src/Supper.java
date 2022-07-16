class Fz

	{
	int a=25;
		void show()
		{
		System.out.println("hello");
		}}

	
	 class D extends Fz
	 {
		int a=1;
	 
		void show()
		{
			
			System.out.println("i love u");
			super.show();
			System.out.println(a);
			System.out.println(super.a);
			
		}
		}
class Supper
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		D r=new D();
		r.show();

}}