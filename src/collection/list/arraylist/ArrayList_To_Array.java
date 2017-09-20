package collection.list.arraylist;

import java.util.*;
public class ArrayList_To_Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		//Following is simple code snippet that converts an array list of countries into string array.

		List<String> list = new ArrayList<String>();
				
			list.add("India");
			list.add("Switzerland");
			list.add("Italy");
			list.add("France");
			
		String [] countries = list.toArray(new String[list.size()]);
		
		for(String kapils:countries)
		{
			System.out.println(kapils);
		}
		
		
		//**** this is to convert arrayList to array
		
		//So to convert ArrayList of any class into array use following code. Convert T into the class whose arrays you want to create.

		//List list1 = new ArrayList();
			
		//String[] countries1 = (String[]) list1.toArray(new String[list1.size()]);
		
		

	}

}
