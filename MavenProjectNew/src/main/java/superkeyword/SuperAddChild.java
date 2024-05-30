package superkeyword;

public class SuperAddChild extends SuperAdd{
	public void devision()
	{
		int d=super.addition(15, 20);
		System.out.println(d);
		if(d%10==0)
		{
			System.out.println("the sum is divisible by 10");
		}
		else
		{
			System.out.println("not divisible by 10");
		}
	}

	public static void main(String[] args) {
		
		SuperAddChild obj=new SuperAddChild();
		obj.devision();

	}

}
