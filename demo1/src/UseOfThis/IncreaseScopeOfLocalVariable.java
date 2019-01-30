package UseOfThis;

public class IncreaseScopeOfLocalVariable {
	int num1;
	int num2;
	void display(int num1,int num2)
	{
		System.out.println(num1);
		System.out.println(num2);
		//to 
		this.num1=num1;
		this.num2=num2;
		
	}
	void mul()
	{
		System.out.println(num1+num2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IncreaseScopeOfLocalVariable ic= new IncreaseScopeOfLocalVariable();
		ic.display(12,22);
		ic.mul();
	}

}
