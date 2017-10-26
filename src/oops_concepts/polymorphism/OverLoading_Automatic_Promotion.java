package oops_concepts.polymorphism;

public class OverLoading_Automatic_Promotion {
	public void method1(int i)
	{
		System.out.println("This is int-arg method");
	}
	public void method1(float f)
	{
		System.out.println("This is float-arg method");
	}
	public static void main(String[] args) 
	{
		OverLoading_Automatic_Promotion obj =new OverLoading_Automatic_Promotion();
		obj.method1(10);
		obj.method1(10.5f);
		obj.method1('a');
	}

}


/*     byte--->>>short--->>Int--->>Long--->>>Double.
 *              
 *              
 *              char--->>>Int----and same as INT.
 * 
 * 
 *  
 */
