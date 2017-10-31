package stringbuilder;

import java.util.Scanner;
public class Empty_StringBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		
		StringBuilder emptysb = new StringBuilder(" ");
		
		
		
		emptysb.append(str);
		
		
		System.out.println("String Builder before performing delete operation");
		System.out.println(emptysb);
		
		
		
		System.out.println("String Builder **After** performing delete operation");
		emptysb.delete(0, str.length()+1);      //   NOTE :: string length + 1 (PLUS one is mandatory)
		System.out.println(emptysb);
		
		
		
		

	}

}
