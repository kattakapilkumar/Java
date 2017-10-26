package oops_concepts.polymorphism;

public class Overriding_Method_Part2 {
	public static void main(String[] args) 
		{
			Parent1 pobj = new Parent1();
			pobj.marry();
			
			//2
			Child1 cobj = new Child1();
			cobj.marry();
			
			
			//3  imp
			Parent1 pobj1 = new Child1();
			pobj1.marry();
			
			//very imp
			pobj1.method1();

		}

	}
	class Parent1 
	{
		public void method1()
		{
			System.out.println("Parent class method");
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
			System.out.println("girl--1 and this is parent method");
		}
	}
	class Child1 extends Parent1
	{
		public void method1()
		{
			System.out.println("child class method");
		}
		public void money()
		{
			
		}
		public void marry()
		{
			System.out.println("girl---2 and this is child method");
		}
		
		
		
	}

