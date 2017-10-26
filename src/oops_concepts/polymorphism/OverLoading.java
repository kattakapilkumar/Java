package oops_concepts.polymorphism;

public class OverLoading
{
	public void method1()
	{
		System.out.println("This is no-arg method");
	}
	public void method2(int i)
	{
		System.out.println("This is int-arg method");
	}
	public void method3(double d)
	{
		System.out.println("This is double-arg method");
	}
	public void method4(Float f)
	{
		System.out.println("This is float-arg method");
	}
	
	public static void main(String[] args)
	{
		OverLoading ovlobj = new OverLoading();
		ovlobj.method1();
		ovlobj.method2(10);
		ovlobj.method3(100.55);
		ovlobj.method4((float) 10.4);
		ovlobj.method4(10.4f);    // this is another way of declaring float
	}

}
