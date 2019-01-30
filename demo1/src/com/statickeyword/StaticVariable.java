package com.statickeyword;

public class StaticVariable {
/*private static int a;
public void count()
{
	System.out.println(a++);
}
public static void main(String[] args) {
	StaticVariable sv=new StaticVariable();
	sv.count();
}
}
*/
		private static int POCount;  // var. ‘a’ is shared by all objects of this class
		
		public static void main(String [] args  ) { 
			StaticVariable  po1 = new StaticVariable(); 
			po1.updatePOCount();
		 }
		
		public void updatePOCount() { 
			POCount++;
			System.out.println(POCount);
			}  
	}
