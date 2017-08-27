package files;
import java.io.*;
public class FileWriter1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
           FileWriter fw=new FileWriter("java1.txt");
           fw.write("katta"+"\n");
           System.out.println('\n');
           Thread.sleep(100);
           fw.write('\n');
           fw.write("kapil");
           fw.write('\n');
           fw.write("kumar");
           fw.write('\n');
           fw.write("done");
           fw.write("\n    is   notworking");
           fw.flush();
           fw.close();
	}

}

