package com.expectionhandling;

import java.util.Scanner;

public class CustomException extends Exception {
	

public static void display(int a,int b) throws InvalidNumber
{
	if(b==0);
	{
		throw new InvalidNumber ("Second no Can't be zero ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
            Scanner s=new Scanner(System.in);
           System.out.println("Enter first no");
           a=s.nextInt();
          System.out.println("enter second no");
          b=s.nextInt();
          try {
        	  CustomException.display(a, b); 
          } catch (Exception e) {
        	  // TODO Auto-generated catch block
        	  e.printStackTrace();
        	  System.out.println("Invalid Number");
}

	}

}
