package exception_handling.throwsex;
public class Throws_Exception_doStuff {
	public static void main(String[] args)  throws InterruptedException
	{
		dostuff();
	}
	public static void dostuff() 
	{		
		//   domorestuff();		//   ***   don't comment it.  ***
	}	
	public static void domorestuff() throws InterruptedException
	{
		Thread.sleep(10000);
	}
}
