package Array;

public class LinearSearch1 {
public  static int search(int arr[],int find)
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==find)
			return i;
	}
	return -1;
}
	public static void main(String[] args) {
		//LinearSearch1 ls=new LinearSearch1();
		int arr[]={2,4,6,3,10,8,11};
		int find=10;
		int result=search(arr,find);
		if(result==-1)
		{
			System.out.println("Item is not present in the list");
		}
		else
		{
			System.out.println("Item is present at index no "+result);
		}
	
	
}
}
