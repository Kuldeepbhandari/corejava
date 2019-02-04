package com.arrayutility;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"abc","efg","wert","fghj"};
		arr=StringRev.rev(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
