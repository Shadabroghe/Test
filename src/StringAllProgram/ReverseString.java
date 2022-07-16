package StringAllProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-with for loop
		String str="Sundus Shaikh Shadab";
		int len=str.length();
		String rev=" ";
		
		for (int i=len-1; i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.print(rev);
		
		//2-with string buffer.
		
	/*	StringBuffer sf= new StringBuffer(str);
		System.out.println(sf.reverse());*/
		
	
		
	}

}
