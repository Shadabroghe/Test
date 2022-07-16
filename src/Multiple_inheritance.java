
interface G{
	
	void show();
	
}

interface V{
	
	void show();
}


public class Multiple_inheritance implements G,V{
	
	
public void show()
{
				System.out.println("multiple inheritance");
				
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiple_inheritance d=new Multiple_inheritance();
		d.show();
	}
	


}
