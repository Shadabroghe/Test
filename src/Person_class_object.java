
public class Person_class_object {

	String name="Shadab";
	int age=27;
	double height=5.7;
	int weight=74;
	
	void study()
	{
		System.out.println("I am studying");
	}
	void eat()
	{
		
	System.out.println("I am eating 3 times a day");
	}
	void play()
	{
		System.out.print("I play cricket on sunday");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person_class_object t=new Person_class_object();
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.height);
		System.out.println(t.weight);
		
		t.eat();
		t.study();
		t.play();
		
		
		
	}

}
