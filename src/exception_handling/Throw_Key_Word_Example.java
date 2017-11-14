package exception_handling;

public class Throw_Key_Word_Example {
	static void validate_age(int age)
	{
		if(age < 18 )
		{
			throw new ArithmeticException("not valid");
			
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}	
	public static void main(String[] args) {
		validate_age(13);		
		System.out.println("rest of the code...");
	}
}
