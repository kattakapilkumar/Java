package exception_handling;
public class Throws_Example_stuff_Exception {
	public static void main(String[] args) {		
		dostuff();
	}
	
	
	public static void dostuff()
	{
		doMoreStuff();
	}
	public static void  doMoreStuff()
	{
		Thread.sleep(10000);	
	}
}
