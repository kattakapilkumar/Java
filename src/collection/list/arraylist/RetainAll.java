package collection.list.arraylist;

import  java.util.*;

public class RetainAll 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner kapil = new Scanner(System.in);
		System.out.println("enter the number of values you want give");
		int n=kapil.nextInt();		
		System.out.println("enter the values you want to give");
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al2  = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			al.add(kapil.next());             //while reading only give the   "next()"   NOT   nextLine()   method
		}
		System.out.println("enter the number of values you want give");
		int m=kapil.nextInt();
		System.out.println("enter the values you want to give");
		for(int j=0; j<m ; j++)
		{
			al2.add(kapil.next());             //only give next not    next Line();  
		} 		
		al.retainAll(al2);
		Iterator<String> itr = al.iterator();
	    while(itr.hasNext()) 
	    {
	    	System.out.println(itr.next());
	    }
		System.out.println();
		
		

	}

}
