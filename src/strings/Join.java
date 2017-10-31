package strings;

import java.util.Scanner;
public class Join {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		String str1   =  sc.nextLine();		
		String str2   =  sc.nextLine();
		String str3   =  sc.nextLine();
		String str4   =  sc.nextLine();
		
		//1) normal method to join two strings
		String newstrop1 = String.join("#@//@#", str2,str3);
		
		System.out.println(newstrop1);
		
		
		//2) here we are keep on adding the same string to the same string........
		String words1[]=str3.split(" ");
		
		String newstrop2="";
		String stradd1 = "";
		for(String kapil1:words1)		
		{
			 newstrop2 = String.join("#@//@#", stradd1,kapil1);
			 stradd1=newstrop2;
		}
		
		System.out.println(newstrop2);
		

	}

}
