package TakingInputUsingKeyboard;

public class CommandLineArgument 
{


	public static void display(String[] args) {
		
		// TODO Auto-generated method stub
		int sortArray[]=new int[args.length];
		
		for(int j=0;j<args.length;j++)
		{
			
			sortArray[j]=Integer.parseInt(args[j]);
			
			
		}
		for(int x:sortArray)
		{
			System.out.println(x);
		}
			

	
	}
public static void main(String[] args) {
	
	CommandLineArgument.display(args);
}
}
