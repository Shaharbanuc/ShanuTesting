package inheritance;

public class HeirarChildOne extends HeirarchichalParent
{
public void displayOne()
{
System.out.println("child one");
}
	public static void main(String[] args)
	{
		
		HeirarChildOne obj1=new HeirarChildOne();
		obj1.displayOne();
		obj1.displayParent();
		
	}

}
