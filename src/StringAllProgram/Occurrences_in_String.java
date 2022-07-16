package StringAllProgram;

import java.util.HashMap;
import java.util.Map;

public class Occurrences_in_String {

	
	public static void getCharCount(String name) {
		
		
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();  
		
		char strArray[]=name.toCharArray();
		
		for(char c:strArray)
			
			if(charmap.containsKey(c)) {
				
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c,1);
				
			}
		
		System.out.println(name+":"+charmap);	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		getCharCount("SHadab Shaikh Saleem");

	}

}
