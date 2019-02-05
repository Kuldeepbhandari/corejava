package com.expectionhandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import TakingInputUsingKeyboard.BufferReader;

public class ExceptionHandling {
	
	
void show() throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
	String string=br.readLine();
}
     void display()
     {
	int a=10;
	int b=20;
	System.out.println(a+b);
     }
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ExceptionHandling eh=new ExceptionHandling();
		try {
			eh.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found exception");
			e.printStackTrace();
		}
		eh.display();
		
		
	}

}
