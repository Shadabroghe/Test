import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\farhan\\Desktop\\javaa.txt");
		try
		{
			if (f.createNewFile())
		{
			System.out.println("file created sucessfully..!");
		}
		else
		{
			System.out.println("file already Exist..!");
		}
			}
		catch(IOException i)
		{
			
			System.out.println(i);
			
		}
		
		
		
		
		
	}

}
