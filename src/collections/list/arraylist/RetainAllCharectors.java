package collections.list.arraylist;


import java.util.*;
public class RetainAllCharectors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner kapil = new Scanner(System.in);
		System.out.println("enter the number of strings");
		int n=kapil.nextInt();
		System.out.println("entr the strings");
		String[] words=new String[n];
		for(int i=0;i<n;i++)
		{
			words[i]=kapil.next();
		}
		ArrayList<Character> al   =  new ArrayList<Character>();
		ArrayList<Character> al2  =  new ArrayList<Character>();
		for(char ch='a';ch<='Z';ch++)
		{
			al2.add(ch);			
		}
		for(int k=0;k<words.length;k++)
		{
				String s2=words[k];
				
				for(char kapilchar:s2.toCharArray())
				{
					al2.add(kapilchar);
					al.retainAll(al2);
				}
				
				
				
				
		}
		
		

	}

}
