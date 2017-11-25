package exception_handling.throwsex;

public class Throws_Exception_mainMethod
{
	public static void main(String[] args)  
	{
		//   dostuff();    //  ***   don't comment it ***
	}
	public static void dostuff() throws InterruptedException 
	{
		
		domorestuff();
		
	}	
	public static void domorestuff() throws InterruptedException 
	{
		Thread.sleep(10000);
	}
}
