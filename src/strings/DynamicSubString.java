package strings;

import java.util.Scanner;

public class DynamicSubString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Scanner k=new Scanner(System.in);
		
		String kapil=k.next();
		int n=kapil.length();
		
		
		String str1 = kapil.substring(0,n/2);
		String str2 = kapil.substring(n/2,n);
		
		
		System.out.println(n/2);
		System.out.println(str1);
		System.out.println(str2);
		

	}

}
