package Collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> CapitalMap=new HashMap<String,String>();
		CapitalMap.put("India", "Delhi");
		CapitalMap.put("Afganistan", "Kabul");
		CapitalMap.put("USA", "New york");
		CapitalMap.put("SriLanka", "Colambo");
		CapitalMap.put("UAE", "Riyaz");
		CapitalMap.put("Soth Africa", "Cape Town");
		
		System.out.println(CapitalMap.get("USA"));
		
		System.out.println("______________________________");
		
		//by using keyset.
		Iterator<String>  it=CapitalMap.keySet().iterator();
		
		while (it.hasNext()) {
		String keys=it.next();
		String value=CapitalMap.get(keys);
		System.out.println("Key="+keys+ "    Value="+value);
		
		}
	
		System.out.println("______________________________");
		
		
		
		//by using Entry set.
		Iterator<java.util.Map.Entry<String, String>>  it2=CapitalMap.entrySet().iterator();
		while(it2.hasNext()) {
			
			java.util.Map.Entry<String, String> Enter=it2.next();
			
			System.out.println("Key="+Enter.getKey()+ "Value=" +Enter.getValue());
		}
		
		System.out.println("______________________________");
		
		
		
		
		//by java 8,for each and lambda.
		
		CapitalMap.forEach((k,v)->System.out.println("Key="+k+"             Value="+v));
		
		
		
		
		
		
	}

}
