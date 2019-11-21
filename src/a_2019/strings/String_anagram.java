package a_2019.strings;

import java.util.Arrays;
import java.util.Scanner;

public class String_anagram {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		//reading the input
		String str1 = sc.next();
		String str2 = sc.next();
		
		//converting to char array	
		char[] charFromWord = str1.toCharArray();
		char[] anagramword  = str2.toCharArray();
		
	    //sorting the string
		Arrays.sort(charFromWord);
		Arrays.sort(anagramword);
		
		int str_len =  str1.length();
		int str_len1 = str2.length();
		
		
		
		if(str_len != str_len1 ) {
						System.out.println("these are not anagrame");
		}
		else
		{
			System.out.println("these are the anagrames");
		}
		
		
	}

}
