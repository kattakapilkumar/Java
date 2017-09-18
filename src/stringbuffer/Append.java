package stringbuffer;


import java.util.*;
public class Append {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nc = sc.nextInt();
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str2);
		StringBuffer sb3 = new StringBuffer(str3);
		StringBuffer str12 = sb1.append(sb2); 
		String newstrofSB = str12.toString();
		
		sb3.append("  1  0");
		
		System.out.println(str12);
		System.out.println(sb3);
		

	}

}
