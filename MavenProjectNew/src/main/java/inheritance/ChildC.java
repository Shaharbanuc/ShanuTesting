package inheritance;

public class ChildC extends ChildB{
	public void displayC()
	{
		System.out.println("child class C");
	}

	public static void main(String[] args)
	{
		ChildC obj=new ChildC();
		obj.display();
		obj.displayB();
		obj.displayC();
		

	}

}
