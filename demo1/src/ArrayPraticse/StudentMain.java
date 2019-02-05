package ArrayPraticse;

import java.util.Scanner;

public class StudentMain {
			 
			static Scanner s=new Scanner(System.in);
			static Student [] stuArray;
	     public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("enter the size of array");
 int size=s.nextInt();
 stuArray=new Student[size];
 
 for(int i=0;i<stuArray.length;i++)
 {     
	 
	 stuArray[i]=getStudent(); //to call a method in java
	 
	 System.out.println(stuArray[i]);
 }

 

	}
	public static Student getStudent() {
		System.out.println("enter Student Deatils");
		String name=s.next();
		String Address=s.next();
		String Course=s.next();
		int id=s.nextInt();
		return new Student(name,Address,Course,id);
	}

}
