package ArrayPraticse;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		//int c[]=new int[4];
		int b[]=new int[10];
         b[1]=1112;
 //before pass the value to the method
 System.out.println(b[1]);
m(a,b);
System.out.println(a);
System.out.println(b[2]);
System.out.println(b[1]);

	}
	
public static int m(int number,int[]number1)
{
	
	number=100;
	number1[2]=120;
	
	 
			number1[1]=232;
			return 0;
			
	
}
}
