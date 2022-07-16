package Collections;
import java.util.LinkedList;
import java.util.List;

public class Collrctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> name=new LinkedList<String>();
		
		name.add("Shadab");
		name.add("SHahbaz");
		name.add("farhan");
		name.add("Hassan");
		
		System.out.println(name);
		name.remove(2);
		System.out.println(name);
		name.set(2, "sundus");
		System.out.println(name);
		name.addFirst("Shahrukh");
		System.out.print(name);
		
		
		
		
		
		
	}

}
