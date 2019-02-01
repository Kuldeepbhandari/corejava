package Array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={38,52,23,43,1,21,24,5};
		
Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int k=s.nextInt();
int a[]=new int[k];
		
		System.out.println("Enter the element of array");
		for(int b=0;b<k;b++)
		{
			a[b]=s.nextInt();
		}
		
		int min, temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}
