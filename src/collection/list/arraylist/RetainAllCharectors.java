package collection.list.arraylist;


import java.util.*;
public class RetainAllCharectors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner kapil = new Scanner(System.in);
		//System.out.println("enter the number of strings");
		int n=kapil.nextInt();
		kapil.nextLine();
		//System.out.println("entr the strings");
		String[] words=new String[n];
		for(int i=0;i<n;i++)
		{
			words[i]=kapil.nextLine();
		}
		ArrayList<Character> al   =  new ArrayList<Character>();
		ArrayList<Character> alAPLHA  =  new ArrayList<Character>();
		for(char ch='a';ch<='z';ch++)
		{
			alAPLHA.add(ch);			
		}
		/*Iterator itr2=al2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}*/
		for(int k=0;k<words.length;k++)
		{
				String s2=words[k];
				//System.out.println(words[k]);
				for(char kapilchar:s2.toCharArray())
				{
					al.add(kapilchar);
					/*Iterator itr=al.iterator();
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}*/
					
				}
				alAPLHA.retainAll(al);
				al.clear();
				
				/*Iterator itr1=al.iterator();
				while(itr1.hasNext())
				{
					System.out.print(itr1.next());
				}*/
				//System.out.println("now the size is");
				//System.out.println(alAPLHA.size());
				
				//Iterator itr1=alAPLHA.iterator();
			//	while(itr1.hasNext())
			//	{
			//		System.out.print(itr1.next());
			//	}
				
		}
		
		
		System.out.println(alAPLHA.size());
		/*Iterator itr1=alAPLHA.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next());
		}*/
		

	}

}
