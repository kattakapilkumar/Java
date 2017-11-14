package exception_handling.throwsex;

public class Throws_dostuff_No_Exception {
	public static void main(String[] args)  throws InterruptedException
	{
		dostuff();
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
