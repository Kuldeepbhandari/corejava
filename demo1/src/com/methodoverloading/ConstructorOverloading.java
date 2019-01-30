package com.methodoverloading;
class Hello1
{
	
	public Hello1(int a)
	{
		;
		System.out.println("constructor overloading");
	}
	public Hello1(int a,int b)
	{
		System.out.println("overloaded constructor");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello1 h=new Hello1(24);
Hello1 h1=new Hello1(10,20);



	}

}
