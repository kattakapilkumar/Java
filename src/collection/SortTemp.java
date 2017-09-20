package collection;

import java.util.*;
public class SortTemp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> al=new ArrayList<>();
		al.add("srinivas");
		al.add("kapil");
//		
		Collections.sort(al);
	//al.size()
		String a[]=new String[al.size()];
		a=al.toArray(a);
		Arrays.sort(a);
		
		

	}

}
