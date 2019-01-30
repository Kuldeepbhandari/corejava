package com.block;

public class StaticBlockInitilizingTheValue {
	static int id;
	//static block
	static
	{
		id=11;
	}
	//static method
	static void show()
	{
		id=23;
	}
	static void display()
	{
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
