package collection.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Generic_String_To_String_Append_StringBuilder{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		
		
		HashSet<String> hs1 = new HashSet<String>();
		
		
		
		int i=0;
		hs1.add(str.substring(i,i+1));
		
		
		//using the  **  Character---GENERIC **
		LinkedHashSet<Character> charhashset = new LinkedHashSet<Character>();		
		for(int x=0;x<str.length();x++)
		{
			charhashset.add(str.charAt(x));
		}
		// we can directly    print by using the for each loop of charector TYPEs
		for(char kapil1:charhashset)
		{
			System.out.print(kapil1);
		}

	}
}
