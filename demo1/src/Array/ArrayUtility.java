package Array;

public class ArrayUtility {
	
	
	static void rev(String arr[])
	{
		int a;
		String rev1="";
		a=arr.length;
		//System.out.println(a);*/
		
			for(int i=0;i<a;i++)
			{
				rev1=arr[3-i];
				System.out.println(rev1);
				
			}
	}
	static void sort(String arr[])
	{
		
	}
	
	//Main method
		public static void main(String[] args) {
			
			String arr[]={"abc","efg","wert","fghj"};
			ArrayUtility.rev(arr);
			ArrayUtility.sort(arr);
			

		
	}

}
