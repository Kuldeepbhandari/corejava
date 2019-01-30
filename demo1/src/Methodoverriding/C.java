package Methodoverriding;

public class C extends B {
	int a=30;
	void show()
	{
		
		A ab=this; //to invoke the class A variable we can create 
		System.out.println(ab.a);
		B bb=this;
		System.out.println(bb.a);

		
	}

}
