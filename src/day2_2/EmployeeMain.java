package day2_2;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryEmp factEmp = new FactoryEmp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Type: ");
		String employeeType = sc.nextLine();
		try
		{
			Employee emp = factEmp.getEmployee(employeeType);
			emp.calculateSalary_loan();
		}
		catch(NullPointerException e)
		{
			System.out.println("Invalid Employee Type.");
		}
	}

}
