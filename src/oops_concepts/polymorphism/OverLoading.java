package oops_concepts.polymorphism;

public class OverLoading
{
	public void method1()
	{
		System.out.println("This is no-arg method");
	}
	public void method1(int i)
	{
		System.out.println("This is int-arg method");
	}
	public void method1(double d)
	{
		System.out.println("This is double-arg method");
	}
	public void method1(Float f)
	{
		System.out.println("This is float-arg method");
	}
	
	public static void main(String[] args)
	{
		OverLoading ovlobj = new OverLoading();
		ovlobj.method1();
		ovlobj.method1(10);
		ovlobj.method1(100.55);
		ovlobj.method1((float) 10.4);
		ovlobj.method1(10.4f);    // this is another way of declaring float
	}

}
