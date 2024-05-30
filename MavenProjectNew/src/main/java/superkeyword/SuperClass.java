package superkeyword;

public class SuperClass {
	//int a,b;
	int sum;
	public SuperClass()
	{
		System.out.println("parent's constructor");
	}
	public void add(int a,int b)
	{
		//this.a=a;
		//this.b=b;
		sum=a+b;
	}

}
