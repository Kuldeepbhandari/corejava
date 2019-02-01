package com.objectusage;

class USerOperation  {
	Gmail g;               
	void ratan()
	{
		System.out.println("ratan operation");
		  g=new Gmail();
		g.compose();
	}
	void anu()
	{
		System.out.println("anu operation ");
 g= new Gmail();
		g.inbox();
	}
	void gaurav()
	{
		System.out.println("gaurav operation");
		 g=new Gmail();
		g.sentItem();
	}

}
