package oops_concepts.polymorphism;

public class OverLoading_Automatic_Promotion_ObjectTypes{
	public void method1(String s)
	{
		System.out.println("String version");
	}
	public void method1(Object o)
	{
		System.out.println("Object Vesrion");
	}
	public static void main(String[] args)
	{
		OverLoading_Automatic_Promotion_ObjectTypes obj1=new OverLoading_Automatic_Promotion_ObjectTypes();
		obj1.method1(new Object());
		obj1.method1("kapil");
		obj1.method1(null);
		
	}

}
