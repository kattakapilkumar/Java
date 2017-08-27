package files;
import java.io.*;
public class CreateFile1 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f=new File("java1.txt");
		f.createNewFile();
        System.out.println(f.exists());
	}

}
