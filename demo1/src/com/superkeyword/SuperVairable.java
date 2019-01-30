package com.superkeyword;

public class SuperVairable extends SuperParent {
	int a=100;
	int b=200;
	void m1(int a,int b)//local variable
	{
		System.out.println(a+b);//to access the local variable
		System.out.println(this.a+this.b);//to access the current class variable
		
		System.out.println(super.a+super.b);//to access the super class variable
	}
	public static void main(String[] args) {
		SuperVairable sv= new SuperVairable();
		sv.m1(134, 20);
	}

}
