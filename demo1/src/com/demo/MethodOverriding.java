package com.demo;
class Abc 
{
	  void sum(int a)
	{
		 
		System.out.println("hello");
	}
}

class Bd extends Abc {

	
		  void sum(int a,int b)
		{
			  super.sum(10); //to call the parent class method we use super keyword
			 int add=a+b;
			 super.sum(10);
			System.out.println(add);
		}

	}
public class MethodOverriding
{
	public static void main(String args[])
	{
		Bd d=new Bd();
		d.sum(10,20);
	}
}

