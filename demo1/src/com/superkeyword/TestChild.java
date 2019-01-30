package com.superkeyword;
class GrandParent
{
	int c;
	GrandParent(int c)
	{
		this.c=c;
	}
}
class Paren extends GrandParent
{
	int b;
Paren(int b,int c) {
		super(c);
		this.b=b;
	}
	
}

public class TestChild  extends Paren{
int a;
	TestChild(int a,int b, int c) {
		super(b, c);
		this.a=a;
	}
	void disp()
	{
		
		
		System.out.println("grand parent=" +c);
		System.out.println("child class=" +a);
		System.out.println("parent class=" +b);
	}

	public static void main(String[] args) {

		TestChild tc=new TestChild(10,20,30);
		tc.disp();
	}

}
