package strings;


import java.util.*;
public class SplitMethod1_For_Each 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String k=sc.nextLine();
		String str2 = sc.nextLine();
		char ch=sc.next().charAt(0);
		
		String words[]=k.split("\\s");
		String words1[]=str2.split("@");
		for(String kapils:words)
		{
			char ch1[]=kapils.toCharArray();
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i] == ch)
				{
					ch1[i] = '1';
				}
			}
			
			String tstring =String.valueOf(ch1);
			
			System.out.println(tstring);
			
			/* for(char kapilc:ch1)
			{
				if(kapilc == ch)
				{
					System.out.println("asinging is taking place");
					kapilc = '1';
					System.out.println(kapilc);
				}
			} */
		}
		/* for(String kapils2:words)
		{
			System.out.println(kapils2);
		} */
		for(String kapilstr2:words1)
		{
			System.out.println(kapilstr2);
		}

	}

}
