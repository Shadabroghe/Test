import java.util.HashMap;
import java.util.Map;

public class Tp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-----------------------------------------------------//Occurance// ---------------------------------------------------------------
		String name="Shadab Shaikh Saleem";
		
	/*	Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		
		char stringarray[]=name.toCharArray();
		
		for(char a : stringarray) {
			
			if(charmap.containsKey(a)) {
				
				charmap.put(a, charmap.get(a)+1);
			}
			else {
				charmap.put(a,1);
			}
			
		}
		System.out.print(name+":"+charmap);*/
	//---------------------------------------------------------//reverse string//-------------------------------------------------
		
	/*	int len=name.length();
		String rev="";
		for(int i=len-1 ;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.print(rev);*/
		
	//-------------------------------String Buffer---------------------------------------------------------
		
		
	/*	StringBuffer strb=new StringBuffer(name);
		System.out.print(strb.reverse());*/
		
	//--------------------------------Split--------------------------------------------------------------------	
		
		
		String word[]=name.split(" ");
		for(String a:word) 
			System.out.println(a);
//------------------------------------------------------------------------Array----------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
