package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int sizeofarray=s.nextInt();
		
		int arr[]=new int[sizeofarray];
		
		System.out.println("Enter the element of array");
		
		for(int a=0;a<sizeofarray;a++)
		{
			arr[a]=s.nextInt();
		}
		 System.out.print("Enter the Number to be Search...");
	      int  num = s.nextInt();
	      
	      for(int i=0;i<arr.length;i++)
	      {
	    	  if(num==arr[i])
	    	  {
	    		  System.out.println("no is present in the array");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("No is not present in the array ");
	    	  }
	      }
	      
		   
	}

}
