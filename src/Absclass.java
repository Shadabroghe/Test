abstract class Animal{
	void legs()
	{
		System.out.println("animal has 4 legs");
	}
	
	abstract void sound();
	abstract void eat();
	
}
class Dog extends Animal {
	void sound()
	{
		System.out.println("bow bow...");
	}
	void eat()
	{
		System.out.println("motton");
	}
	
}
class Cow extends Animal{
	
	void sound ()
	{
		System.out.println("oooo oooo...");
	}
	void eat()
	{
		System.out.println("grass");
	}
}




public class Absclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog(); 
		d.sound();
		d.eat();
		d.legs();
		
		
		
		Cow c=new Cow();
		c.sound();
		c.eat();
		d.legs();		
		
		
		
	}

}
