package oops_concepts.coupling;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Example1 obj = new Example1();
		//ClassA  obja= new ClassA();  //creating object for the classA  
		int finalres= ClassA.i;   //directly we can call "i" variable in classA beacause we declare it has a static
		System.out.println(finalres);

	}
	public static  class ClassA 
	{
		ClassA obja1 =  new ClassA();
		static int i=ClassB.j;
	}
	public static class ClassB
	{
		static int j=ClassC.k;
	}
	public static class ClassC
	{
		static int k=ClassD.m1();
	}
	public static class ClassD
	{
		public static int m1()
		{
			return 10;
		}
	}

}
