package TakingInputUsingKeyboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader {

	

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
      String num=br.readLine();
      System.out.println(num);
      //using scanner 
		/*Scanner s=new Scanner(new File("input.txt"));
	      while(s.hasNextLine())
	
		   {
		
			System.out.println(s.nextLine());
		   }
		*/*/
	
}
}
