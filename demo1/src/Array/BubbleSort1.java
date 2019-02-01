package Array;

import java.util.Scanner;

public class BubbleSort1 {
	static int temp ;
	static int j ;
	
	public static void main(String[] args) {
		//InsertionSort is=new InsertionSort();
		//int a[]={12,5,23,1,45,24};
    Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int k=s.nextInt();
int a[]=new int[k];
		
		System.out.println("Enter the element of array");
		
		
		for (int i=1;i<a.length;i++)
		{
		for (int j=0;j<a.length;j++)
		{
			if (a[j]>a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

}
}
