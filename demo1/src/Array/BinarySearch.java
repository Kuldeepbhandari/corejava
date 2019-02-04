package Array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int []a={2,5,7,9,11,14,15,18,20,22};
		int z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array element");
		z=s.nextInt();
		
		int search=1;
		int li=0;
		int hi=a.length-1;
		int mid=(li+hi)/2;
		while(li<=hi)
		{
			if (a[mid]==search)
			{
				System.out.println("The no is found at " +mid+ " position");
				break;
			}
			else if(a[mid]<search)
			
			{
				li= mid+1;
				
				
			}
			else
			{
				hi=mid-1;
			}
			mid=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("item is not prsent in the list");
		}
	}
	
	

}
