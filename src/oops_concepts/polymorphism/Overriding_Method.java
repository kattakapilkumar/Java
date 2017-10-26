package oops_concepts.polymorphism;

public class Overriding_Method {
	
	
	public static void main(String[] args) 
	{
		Parent pobj = new Parent();
		pobj.marry();
		
		//2
		Child cobj = new Child();
		cobj.marry();
		
		
		//3  imp
		Parent pobj1 = new Child();
		pobj1.marry();
		
		//very imp
		pobj1.method1();

	}

}
class Parent 
{
	public void method1()
	{
		System.out.println("Parent");
	}
	
	public void property()
	{
		System.out.println("this is normal property method");
	}
	public void money()
	{
		
	}
	public void marry()
	{
		System.out.println("girl1");
	}
}
class Child extends Parent
{
	public void method2()
	{
		System.out.println("child");
	}
	public void money()
	{
		
	}
	public void marry()
	{
		System.out.println("girl---2");
	}
	
	
	
}