package Methodoverriding;
class OverRiding
{
	private int q=12;
	
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}
}
class mainoveriding extends OverRiding{
	public void sum(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		System.out.println(getQ());
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding o=new mainoveriding();
		o.sum(10,20);
		
	}

}
