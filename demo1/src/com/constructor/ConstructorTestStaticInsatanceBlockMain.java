package com.constructor;

public class ConstructorTestStaticInsatanceBlockMain extends ConstructorTestStaticInsatanceBlock {
	{
		System.out.println("this is child class instance block");
	}
	static
	{
		System.out.println("this is child class static block");
	}
	ConstructorTestStaticInsatanceBlockMain()
	{
		System.out.println("this is child class const");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTestStaticInsatanceBlockMain csm =new ConstructorTestStaticInsatanceBlockMain();
		
	}

}
