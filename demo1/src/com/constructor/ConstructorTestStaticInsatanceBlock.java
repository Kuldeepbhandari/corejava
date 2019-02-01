package com.constructor;

 class ConstructorTestStaticInsatanceBlock {
	 {
		 System.out.println("this is parent class instance block");
	 }
	 static
	 {
		 System.out.println("this is parent class static block");
	 }
	 ConstructorTestStaticInsatanceBlock()
	 {
		 System.out.println("this is parent class const");
	 }
}
