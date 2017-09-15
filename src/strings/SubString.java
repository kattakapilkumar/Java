package strings;

import java.util.*;
public class SubString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner kapil=new Scanner(System.in);
		System.out.println("enter the string");
		String s=kapil.nextLine();
		//int sindex=0,lindex=0;
		System.out.println("so the string length  is\n"+"\n"+s.length());
		System.out.println("enter the starting index");
		int sindex=kapil.nextInt();
		System.out.println("enter the last index");
		int lindex=kapil.nextInt();
		System.out.println("enter only one index index");
		//*************************
		
		int oneindex = kapil.nextInt();
		if(sindex==lindex)
		{
			System.out.println("you are going to get   a null string");
		}
		
		//**************
		
		String finaloutput=s.substring(sindex,lindex);
		String nstr1=s.substring(oneindex+1);
		String nstr2=s.substring(oneindex);
		System.out.println("***************");
		System.out.println(" giving olny one index value and adding one to it"+nstr1);
		System.out.println("***************");		
		System.out.println(nstr2);
		System.out.println("***************");
		System.out.println("here is your substring from    "+sindex+"  to "+lindex);
		System.out.println(finaloutput);
	}

}
