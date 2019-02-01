package Array;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		//int i,j;
		int temp;
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int sizeofarray=s.nextInt();
		
		int arr[]=new int[sizeofarray];
		
		System.out.println("Enter the element of array");
		
		for(int a=0;a<sizeofarray;a++)
		{
			arr[a]=s.nextInt();
		}
		for (int i=0;i<sizeofarray;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
