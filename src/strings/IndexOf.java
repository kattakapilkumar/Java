package strings;

import java.util.*;
public class IndexOf 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		String str0 = sc.next();
		String str5 = sc.next();
		String str11 = sc.next();
		
		
		int index1=  str1.indexOf('k');
		
		
		//********     not present character
		int index2 = str2.indexOf('z');
		System.out.println(index1);
		
		System.out.println(index2);

		//*******   index of substring   
		int index3 = str3.indexOf(str0);
		System.out.println(index3);
		
		
		//******* from respective index   
		int index4 = str4.indexOf("k",3);
		System.out.println(index4);
		
		
		//***** return  index of a string after specified position
		int index5 = str5.indexOf(str11,5);
		System.out.println(index5);
		
		

	}

}
