package com.arrayutility;

class StringRev {
	public static String[] rev(String arr[])
	{
		
		String rev1="";
		String temp;
		int len=arr.length;
		
		for(int i=0;i<len/2;i++)
		{
			temp=arr[len-i-1];
			arr[len-i-1]=arr[i];
			arr[i]=temp;
			
		}
			return arr ;
	}

	

}
