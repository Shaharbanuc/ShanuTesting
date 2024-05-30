package inheritance;

public class EmployeeNetSal extends EmployeeHra
{
	float net;

	public void netSalary()
	{
		net=sal+hra-pf-deduction+bonus;
		//return net;
	}
	public void getSalarySlip()
	{
		System.out.println("Salary slip "+"\n"+"basic pay "+sal+"\n"+"deduction "+deduction+"\n"+"bonus "+bonus);
		System.out.println("hra "+hra+"\n"+"pf "+pf+"\n"+"Net Salary "+net);
	}
	public static void main(String[] args)
	{
		
		EmployeeNetSal emp=new EmployeeNetSal();
		emp.empHraPf();
		emp.netSalary();
		//System.out.println("hra"+emp.hra);
		//float total=emp.netSalary();
		//System.out.println("The total salary of employee is "+total);
		emp.getSalarySlip();
		

	}

}
