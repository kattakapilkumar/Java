package collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainAll {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		Scanner k=new Scanner(System.in);
		
		
		
		//String s=k.nextLine();
		
		String str1=k.nextLine();
		
		String str2 = k.nextLine();
		
		Set cs1  = new HashSet();
		Set cs2  = new HashSet();
		
		for(char kapil1:str1.toCharArray())
		{
			cs1.add(kapil1);
		}
		for(char kapil2:str2.toCharArray())
		{
			cs2.add(kapil2);
		}
		
		
		
		//if()
	//	{
			     //CHECK THE SIZE HERE TO CHECK ANAGRAMS
	//	}
		
		
		if(cs1.containsAll(cs2))
		{
			
			System.out.println("the two string are equal after duplicatees");
			
		}
		
		
		
		
		
		
		

	}

}
