package strings;

import java.util.*;
public class C_charAtMethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=new char[s.length()];
		
		ch[0] = s.charAt(0);  // 0 th index
		ch[1] = s.charAt(2);
		//ch[1] = s.charAt(s.length()); // will trow an exception
		ch[2] = s.charAt(s.length()-1);
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		

	}

}
