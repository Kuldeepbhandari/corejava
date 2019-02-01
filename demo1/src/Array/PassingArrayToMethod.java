package Array;

public class PassingArrayToMethod {
public static void main(String[] args) {
	int arr[]={1,3,3,2,3};
	//passing array to method
	mul(arr);
	
}
	public static void mul(int[] arr)
	{
		//getting sum of array values
		int mul=1;
		for(int i=0;i<arr.length;i++)
		mul *=arr[i];
		System.out.println("sum of array is "+mul);
	}
}
