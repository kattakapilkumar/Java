package oops_concepts.encapsulation;


public class DataHiding 
{
	  
	
	   //data hiding is nothing but 
	   private String name;
	   private String idNum;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
		   //this.age = age;
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( String newId) {
	      idNum = newId;
	   }
	
}
