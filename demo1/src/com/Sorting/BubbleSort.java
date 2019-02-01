package com.Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,2,4,5,6,13,45,56,67,23};
		
		int temp;

		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of item ");
		a=s.nextInt();
		int[] c=new int[a];
		//System.out.println("Enter the elements");
*/		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length-i;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				for(int b=0;b<arr.length;b++)
				System.out.println(arr[b]);
				
					
				}
			}
		}
		
		
	}


