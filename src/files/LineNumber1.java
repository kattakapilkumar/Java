package files;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineNumber1 {

	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		 FileReader fr=new FileReader("java4.txt");
	   	 BufferedReader br=new BufferedReader(fr);
	   	 String fullname = br.readLine();
	   	 int i=0;
	   	 while(fullname!=null)
	   	 {
	   		 i++;
	   		 if(!(fullname.equals(" ")))
	   		 {
	   			System.out.println(i+fullname);
	   		 }
	   		 
	   		 fullname = br.readLine();
	   	 }
	   	 br.close();

	}

}
