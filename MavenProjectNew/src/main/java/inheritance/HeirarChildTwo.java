package inheritance;

public class HeirarChildTwo extends HeirarchichalParent
{
	public void displayTwo()
	{
	System.out.println("child two");
	}

	public static void main(String[] args) 
	{
		HeirarChildTwo obj2=new HeirarChildTwo();
		obj2.displayParent();
		obj2.displayTwo();

	}

}
