package collection.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetAddMethod {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner kapil=new Scanner(System.in);		
		System.out.println("Enter the number of charectors you want to enter");		
		int n=kapil.nextInt();
		char ch;
		Set cs=new HashSet();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter a charecter");
			ch=kapil.next().charAt(0);
			boolean katta=cs.add(ch);
			if(katta)
			{
				System.out.println(""+ch);
				System.out.println("you have entered unique charector");
			}
			else
			{
				System.out.println("sorry you have entered some duplicate charector");
			}
		}

	}

}
