package strings;


import java.util.*;
public class SpliMethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String k=sc.nextLine();
		
		String[] words=k.split("\\s");
		
		for(String kapils:words)
		{
			System.out.println(kapils);
		}

	}

}
