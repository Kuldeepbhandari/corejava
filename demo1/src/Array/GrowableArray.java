package Array;

import java.util.Arrays;
import java.util.Scanner;



public class GrowableArray {
public static void main(String[] args) {
	//GrowableArray ga=new GrowableArray();
	 int arr[]=new int[5];
	 
for( int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
add(arr);
delete(arr);
	
	
	
}
public static void add(  int[] arr)
{

	int z;
	Scanner s=new Scanner(System.in);
	System.out.println("How many no of item you want increase");
	z=s.nextInt();
		
		if (arr.length<=arr.length)
		{
			int arr1[]=new  int[arr.length+z];
			for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);		
		}
		
			
	
}
public static void delete(int []arr){
	int z;
	Scanner s=new Scanner(System.in);
	System.out.println("How many no of item you want delete");
	z=s.nextInt();
	

}
}

