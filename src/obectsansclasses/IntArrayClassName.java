package obectsansclasses;

public class IntArrayClassName 
{

	public static void main(String[] args)
	{
		
		int n=6;
		int a[]=new int[n];
		@SuppressWarnings("rawtypes")
		Class c=a.getClass();
		String name=c.getName();
		System.out.println(name);

	}

}
