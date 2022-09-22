package day2_2;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		int n;
		System.out.println("Enter the type: \n1) Hosteller \n2) Day Scholar");
		n = sc.nextInt();
		
		//System.out.println("Enter the name: ");
		//std.setName(sc.nextLine());
		
		switch(n)
		{
		case 1: std.setName("Abha");
				System.out.println(std.toString());
				Student h = new Hosteller(6,101,908765,"English");
				System.out.println(h.toString());
				break;
				
		case 2: std.setName("Anjali");
				System.out.println(std.toString());
				Student ds = new DayScholar(123456,"Computer Science");
				System.out.println(ds.toString());
				break;
				
		default: System.out.println("Invalid Input.");
		}
	}

}
