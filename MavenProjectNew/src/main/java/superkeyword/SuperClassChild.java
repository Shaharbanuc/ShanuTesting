package superkeyword;

public class SuperClassChild extends SuperClass{
	public SuperClassChild()
	{
		//calling the constructor of superclass
		super();
	}
	
	public void addTwo()
	{
		//calling super class method
		super.add(4, 5);
		//printing the superclass variable sum
		System.out.println(super.sum);
	}

	public static void main(String[] args)
	{
		SuperClassChild obj=new SuperClassChild();
		obj.addTwo(); 
		
	}

}
