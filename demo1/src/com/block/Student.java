package com.block;


	class RealPerson  //delegate   class
	{ 
		void book()
		{
			System.out.println("real java book");
			} }; 
	class DummyPerson  //delegator class 
	{ 
		RealPerson r = new RealPerson(); 
		void book( ) 
		{
			r.book( );
		}
	}
	//delegation };
		public class Student {
	 public static void main(String[] args)  {  
		//outside world thinking dummy Person doing work but not.  
		DummyPerson d = new DummyPerson(); 
		d.book(); 
		}
		}
	
	
	

