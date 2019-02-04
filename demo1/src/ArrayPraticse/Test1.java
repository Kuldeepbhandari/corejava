package ArrayPraticse;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*//int []myList={12,2,3,45,65};
		int a[]=new int[5];
		for(int i=1;i<a.length;i++)
		{
		System.out.println(myList[2]);
		myList[3]=myList[2]+myList[4];
		System.out.println(myList[3]);
			a[1]=a[2]+a[4]+i;
			a[2]=a[1];
			
		
		
		}
		a[3]=a[1]+a[4];
		System.out.println(a[3]);
		System.out.println(a[2]);*/
		//Copying arrays
		
		
		int b[]={12,3,2,1,4};
		int c[]= new int[7];
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
		/*	System.out.println(c[i]);*/
		}
		System.out.println(c[0]);
		System.out.println(c.length);
		System.out.println(b.length);
		//arraycopy utility
		System.arraycopy(b, 0, c, 3,b.length);
	}

}
