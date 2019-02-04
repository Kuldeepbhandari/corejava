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
		    for (int b=0;b<a.length;b++)
		       {
			    a[b]=s.nextInt();
		        }

         boolean flag=true;
		for (int i=0;i<a.length;i++)
		 {
			
		for (int j=0;j<a.length-1;j++)
		 {
			//counter++;
			if (a[j]>a[j+1])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				
				
			}
			
			
		}
		
		if (flag==false)
		{
			break;
		}
		}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i] +"flag");
	}

}
}
