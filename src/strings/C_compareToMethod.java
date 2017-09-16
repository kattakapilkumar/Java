package strings;


import java.util.*;
public class C_compareToMethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int result = s1.compareTo(s2);
        
        int anoresult = s2.compareTo(s1);
        
        System.out.println(result);
        System.out.println("****");
        System.out.println(anoresult);
        
		
		
	}

}
