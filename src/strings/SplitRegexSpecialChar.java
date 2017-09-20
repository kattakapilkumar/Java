package strings;

import java.util.*;
public class SplitRegexSpecialChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String[] words = str1.split("\\W");
		
		for(String kapils:words)
		{
			char[] ch1=kapils.toCharArray();
			System.out.println(kapils);
			
		}
		

		
	}

}
