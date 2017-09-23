package oops_concepts.encapsulation;

import java.util.*;
public class RunDataHiding 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DataHiding encap = new DataHiding();
		Scanner sc=new Scanner(System.in);
		String str1 = sc.nextLine();
		//System.out.println(encap.age);
	      encap.setName(str1);
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());

	}

}
