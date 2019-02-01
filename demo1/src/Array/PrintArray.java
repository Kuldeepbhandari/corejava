package Array;

import java.util.Scanner;

public class PrintArray {
public static void main(String[] args) {
	int arr;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the element");
	arr=s.nextInt();
	int[] a= new int[arr];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("print array"+a[i]);
	}
}

}
