package inheritance;

public class ChildClass extends ParentClass{
	public void subtraction()
	{
		int d=a-b;
		System.out.println(d);
		//System.out.println("this variable belongs to parent class "+c);
		
	}

	public static void main(String[] args) 
	{
		
		ChildClass obj=new ChildClass();
		obj.additionParent();
		obj.subtraction();

	}

}
