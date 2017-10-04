package multi_threading;

public class Extending_ThreadClass1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}	
}
//creation of a thread
class MyThread extends Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("child thread");
			    System.out.println("this is a child thread");
			}
		}
	}

