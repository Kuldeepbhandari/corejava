package ArrayPraticse;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,4,1,5,6,7,13};
sort(arr);
	}
public static void sort(int arr[])
{
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
			if (arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
