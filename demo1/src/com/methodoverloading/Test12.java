package com.methodoverloading;

public class Test12 {

	
		// TODO Auto-generated method stub
 //below two methods are overloaded methods 
		double m1(int a,int b)  
		{ 
			System.out.println("int,int arguments method");
			return 20.5;  } 
		int m1(float f)  
		{ System.out.println("float argument method");  
		return 100;  } 
		public static void main(String[] args)   { 
			Test12 t=new Test12();
			double d = t.m1(10,20);   
			System.out.println("return type="+d); 
			int x = t.m1(10.5f);   
			System.out.println("return type="+x);  } 
	}


