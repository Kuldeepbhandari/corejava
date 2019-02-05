package ArrayPraticse;



public class Student 
{
	String  name;
	String Address;
	String Course;
	int id;
	


	


	
	
	
	public Student() {
		super();
	}
	Student (String name,String Address,String Course,int id)
	       {
		this.name=name;
		this.Address=Address;
		this.Course=Course;
		this.id=id;
		
	       }
	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", Course="
				+ Course + ", id=" + id + " ]";
	}
	
		
	}
		

	


