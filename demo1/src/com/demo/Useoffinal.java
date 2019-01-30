package com.demo;

 class A {
final int a=10;
 }
 public class Useoffinal extends A
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		//A b=new A();
		A c=new Useoffinal();
		
		System.out.println(c.a);

	}

}
