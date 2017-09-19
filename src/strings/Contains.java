package strings;

import java.util.*;
public class Contains 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str = sc.next();
		String str2 = sc.next();
		
		
		boolean katta = str.contains("kkk");
		boolean rambo = str.contains(str2);
		System.out.println(katta);
		System.out.println(rambo);

	}

}
