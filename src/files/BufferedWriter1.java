package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("java3.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("kapil");
		bw.newLine();
		bw.write("kumar");
		bw.newLine();
		bw.write("katta");
		bw.flush();
		bw.close();
        fw.close();
	}

}
