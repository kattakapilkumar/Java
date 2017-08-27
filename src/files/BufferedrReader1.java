package files;
import java.io.*;
public class BufferedrReader1 
{
     public static void main(String[] args) throws Exception
     {
    	 FileReader fr=new FileReader("java3.txt");
    	 BufferedReader br=new BufferedReader(fr);
    	 String fullname = br.readLine();
    	 while(fullname!=null)
    	 {
    		 System.out.println(fullname);
    		 fullname = br.readLine();
    	 }
    	 br.close();
     }
	
     
	
}
