package com.demo;
class Ab
{
	public void abs(int a,int b)
	{
System.out.println("value of a "+a+ ""+b);		
	
}
	public void abs(int a, int b,int c)
	{
		System.out.println("value of a"+a+ " "+b+ " "+c);
	}
}
public class MethodOverloading{
	public static void main(String[]args)
	{
		Ab a=new Ab();
		a.abs(10, 20);
		a.abs(12, 23, 35);
		
	}

}
