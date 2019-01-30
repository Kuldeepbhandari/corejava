package com.methodoverloading;
class Abc
{
	public int sum(int a,int b)
	{
		/*int add=a+b;
	System.out.println(add);*/
		return a*b;
	}
	public int sum(int a,char b,int c)
	{
		/*double addd=a+b+c;
		System.out.println(addd);*/
		return a*b*c;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc b=new Abc();
		b.sum(10,20);
		//b.sum(10, 20.45f,30);
		b.sum(10,'a',20);
	
	}

}
