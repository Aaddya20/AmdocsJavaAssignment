package day5_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		List<CourseDetails> cd = new ArrayList<>();
		List<StudentDetails> sd = new ArrayList<>();

		System.out.print("Welcome to E-Learning Portal!!");
		try {
			boolean flag = true;
			while (flag) {
				System.out.println(
						"\nChoose any one from the following: \n1.Add new course \n2.Add new Students \n3.View All course details \n4.View Student details by course \n5.Exit");
				num = sc.nextInt();
				if (!(num > 0 && num < 6))
					throw new InvalidInputException("Input should be in between 1-5.");

				switch (num) {
				case 1:
					System.out.println("Enter the no. of Courses you want to add: ");
					int a = sc.nextInt();
					
					for (int i = 0; i < a; i++) {
						System.out.println("Enter the \nCourse Name:  \nCourse ID:  \nFee: ");
						String b = sc.next();
						int c = sc.nextInt();
						int e = sc.nextInt();
						
						cd.add(new CourseDetails(b, c, e));
					}
					break;

				case 2:
					System.out.println("Enter the no. of Students you want to add: ");
					int sa = sc.nextInt();
					int xx=2;
					for (int i = 0; i < sa; i++) {
						System.out.println("Enter the \nEnrollment ID:  \nStudent Name:  \nCourse Name: \nCourse ID: ");
						int b = sc.nextInt();
						String c = sc.next();
						String d = sc.next();
						int e = sc.nextInt();
						for (CourseDetails cdt : cd) {
							if (cdt.getCourse_id() == e)
							{
								xx=1;
								break;
							}
							else
								xx = 0;
						}
						if(xx==0)
							throw new InvalidInputException("Course ID should match one of the courses.");
						sd.add(new StudentDetails(b, c, d, e));
					}
					break;

				case 3:
					for (CourseDetails cod : cd) {
						System.out.println(cod.toString());
					}
					break;

				case 4:
					System.out.println("Enter the Course ID to view details of Students: ");
					int x = sc.nextInt();
					List<StudentDetails> csd = new ArrayList<>();
					for (StudentDetails std : sd) {
						if (std.getCourse_id() == x)
							csd.add(std);
					}
					Collections.sort(csd, new Sortbyenroll());
					System.out.println("\nSorted by Enrollment ID");
					for (int i = 0; i < csd.size(); i++)
						System.out.println(csd.get(i));
					break;

				case 5:
					System.out.println("Exit");
					flag = false;
					break;
				default:
					System.out.println("Invalid Input");
				}

			}
		} catch (InvalidInputException iie) {
			System.out.println(iie.getMessage());
		}

	}

}