package inheritance;

public class EmployeeHra extends EmployeeSalary
{
	float hra;
	float pf;
	public void empHraPf()
	{
      hra=sal*0.05f;
     // System.out.println("hra"+hra);
      pf=sal*0.20f;
      
      //System.out.println("pf"+pf);
	}

}
