package obectsansclasses;


public class ClassName 
{

	public static void main(String[] args)
	{
		
		String sobj="this is a string";
		Class<? extends String> c=sobj.getClass();
        String name=c.getName();
        System.out.println(name);
	}
	
	
	/*public static void main(String[] args)
	{
		
		String sobj="this is a string";
		@SuppressWarnings("rawtypes")
		Class c=sobj.getClass();
        String name=c.getName();
        System.out.println(name);
	}*/	
}
