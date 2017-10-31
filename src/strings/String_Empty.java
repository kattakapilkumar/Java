package strings;

import java.util.Scanner;
public class String_Empty {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 =  sc.nextLine();
		String str3 =  sc.nextLine();
		String str4 =  sc.nextLine();
		
		System.out.println("second string before assigning to empty string ::: "+ str2 +"");
		str2 = "";
		
		System.out.println(str2);
		System.out.println("third string assigning to empty string");
		
		str3 = str4;
		
		System.out.println(str3);
		
		
		
		

	}

}
