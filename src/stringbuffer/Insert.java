package stringbuffer;

import java.util.*;
public class Insert
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String str3 = sc.next();
		String str4 = sc.next();
		String str5 = sc.next();
		StringBuffer sbf1 = new StringBuffer(str1);
		StringBuffer sbf2 = new StringBuffer(str2);
		StringBuffer sbf3 = new StringBuffer(str3);
		StringBuffer sbf4 = new StringBuffer(str4);
		//***Normal insertion  *******//
		sbf1.insert(1," AWESOME");
		//************************//
		//******** outofRange Insertion ****//
		sbf2.insert(7, "outofrange");
		//**********************//
		//######################//
		//****** another outofRange insertion   ****//
		sbf3.insert(-1,"its just a string");
		//
		//Inserting another string 
		sbf4.insert(3,str5);
		
		
		
		

	}

}
