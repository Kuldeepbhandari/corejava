package ArrayPraticse;



public class Student 
{
	String  name;
	String Address;
	String Course;
	


	public Student() {
		super();
	}


	
	
	
	Student (String name,String Address,String Course)
	       {
		this.name=name;
		this.Address=Address;
		this.Course=Course;
		
	       }
	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", Course="
				+ Course + "]";
	}
	
		
	}
		

	


