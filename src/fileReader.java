
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader r=new FileReader("C:\\Users\\farhan\\Desktop\\javaaa.txt");
			try {
				int i;
				while ((i=r.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
				
			finally {
				r.close();
				System.out.print(" file closed");
			}
			}
		
			
			catch(IOException e) {
				
				System.out.println(e);
			}
			
			
			
			
		
		
		}
		
		
		
	}


