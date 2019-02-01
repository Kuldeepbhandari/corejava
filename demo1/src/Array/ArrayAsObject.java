package Array;

import java.util.Scanner;

class Student {
	 String name;
	 int id;
	 Student(String name, int id)
	 {
		 this.name=name;
		 this.id=id;
	 }

}

public class ArrayAsObject  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter The Name and Id");
		int arr=s.nextInt();*/
Student [] arr=new Student[5];
arr[0]=new Student("kuldeep",12);
arr[1]=new Student("gaurav",13);
arr[2]=new Student("harit",133);
arr[3]=new Student("abhi",134);
arr[4]=new Student("shyam",135);

for(int i=0;i<arr.length;i++)
{
	System.out.println("using array of object " +arr[i].name+ " and id is "+arr[i].id);
}

	}

}
