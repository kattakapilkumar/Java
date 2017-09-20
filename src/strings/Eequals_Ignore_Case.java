package strings;

import java.util.*;
public class Eequals_Ignore_Case
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();		
		String str2 = sc.next();
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("the two strings are equal");
		}

	}

}
