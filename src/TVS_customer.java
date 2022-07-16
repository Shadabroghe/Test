
                                     //abstraction by interface
interface vehichal{
	String Name="TVS";     //public+static+final
	int Speed=100;         //public+static+final
	
	void start();
	void stop();
	default void color() {
		System.out.println("tvs color is red");
		
	}
	static void body()
	{
		System.out.println("steel body");
	}
	
	
}

public class TVS_customer implements vehichal {

	public void start() {
		System.out.println("Start()=insert key bike will start");
	}
	public void stop()
	
	{
		System.out.println("Stop()=remove key");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVS_customer c=new TVS_customer();
		c.start();
		c.stop();c.color();
		vehichal.body();
		System.out.println(Speed);
		
		
		
	}

}