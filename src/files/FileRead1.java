package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f=new File("java2.txt");
		char[] ch = new char[(int)f.length()];
		long length1 = f.length();
		System.out.println(length1);
		@SuppressWarnings("resource")
		FileReader fr = new FileReader(f);
		fr.read(ch);
		fr.close();
		//System.out.println(ch[8]);
		
		//String s=ch.toString();
		//System.out.println(s);
		StringBuffer sb=new StringBuffer(" ");
		for(char kapil1:ch)
		{
			
			sb.append(kapil1);
			
			System.out.print(kapil1);
			
		}
		System.out.print('\n');
		System.out.print(sb);
	}

}
