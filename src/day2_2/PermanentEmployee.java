package day2_2;

import java.util.Scanner;

public class PermanentEmployee implements Employee {

	double salary,pf,basic,loan;
	Scanner sc = new Scanner(System.in);
	@Override
	public void calculateSalary_loan() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee ----");
		System.out.println("Enter the Basic Salary:");
		basic = sc.nextDouble();
		pf = 0.12 * basic;
		salary = basic - pf;
		loan = 0.15 * salary;
		System.out.println("PF Amount = " + pf);
		System.out.println("In-hand Salary = " + salary);
		System.out.println("Amount for Loan = "+ loan);
	}

}
