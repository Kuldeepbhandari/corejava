package Methodoverriding;

import com.Interface.Mobile;

 class AsusMobileProM1 implements Mobile {
	 int a;
	 
	 
public void camera(int a)

{
this.a=a;

System.out.println("front camera is 5px");
}


@Override
public void display() {
System.out.println("show the mobile display");	
}


@Override
public void call() {
System.out.println("call on hold");	
}
}
