package multi_threading;

public class Overriding_Run_Method 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		kapilThread t = new kapilThread();
		t.start();		
		t.run(10);
		
	}
}
class kapilThread extends Thread
{
	public void run()
	{
		System.out.println("this is no-arg run method");
		System.out.println("this is executing by t.start()");
	}
	public void run(int i)
	{
		System.out.println("this is int-arg run method");
		System.out.println("this is executing by t.run(10)");
	}
}
