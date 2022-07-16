
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
				FileWriter o=new FileWriter ("C:\\Users\\farhan\\Desktop\\javaaa.txt");
				try
				{
					o.write("java is best");
				
				}
				finally {
					o.close();
				}
				System.out.println("successfully writen");
		}
		catch(IOException i) {
			System.out.println(i);
		}

		}
	}


