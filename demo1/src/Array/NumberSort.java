package Array;

import java.util.Scanner;

public class NumberSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NumberSort ns=new NumberSort();
		int num=23465;
		int temp,a,b,c;
		int i=0;
		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter a Integer no");
		num=s.nextInt();
		int arr[]=new int[num];*/
		int arr[]=new int[5];
		while(num>0)
		{		
		    a=num/10;
			b=num%10;
			num=a;
		    arr[4-i]=b;
		    i++;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		
		
		
		
		//int arr[]=new int[5];
		
		/*int temp=0;
		int a;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num>=0)
			{
				
			}
		}*/
		/*while(num>=0)
		{
			
			if(num!=0)
			{//a=num/10;
		temp=num%10;
		b=temp;
	a=num/10;
	
			}*/
	
	
	
		
		}
		
		
		
			
	}


