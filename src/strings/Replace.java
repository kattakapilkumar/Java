package strings;

import java.util.*;

public class Replace 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();  //taking only one string as a sentence
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		//******** here we are taking only one string		
		String str1Replace=str1.replace("a","X");		
		System.out.println(str1Replace);
		//it will work good
		
		//****** taking a string an indivisual required string or charactor
		
		String str2Replace=str2.replace("a","x");
		System.out.println(str2Replace);
		
		//***  this is case 3
		String str3Replace=str3.replace("a","x");
		System.out.println(str3Replace);
	}

}

/*
 * input and output
kapikl
kapil a
::::::output:::::

kXpikl
kxpil

 */
