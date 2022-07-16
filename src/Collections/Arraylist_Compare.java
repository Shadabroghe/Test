package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> L1=new ArrayList<String>(Arrays.asList("Shadab", "Shaikh","Saleem","Abd kareem"));
		ArrayList<String> L2=new ArrayList<String>(Arrays.asList( "Saleem","Mohammad","Shadab", "Shaikh"));
		
		Collections.sort(L2);
		System.out.println(L2);
		
	//	System.out.println(L1.equals(L2));
		
	//	L1.removeAll(L2);                   //Remove all element from L1 which is present in L2.
	//	System.out.println(L1);
		
		L1.retainAll(L2);                    //Retain all element from element L1 and L2 which is common. 
		System.out.print(L1);
		
		
		
		
		
		
		
		
		
	}

}
