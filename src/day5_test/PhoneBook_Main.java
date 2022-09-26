package day5_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		List<Contact> ct = new ArrayList<>();
		
		System.out.print("Welcome to Phone-Book!!");
		try {
			boolean flag = true;
			while (flag) {
				System.out.println("\nChoose any one from the following: \n1.Add new contact \n2.View all contacts \n3.View Contact details by name \n4. Remove a contact \n5.Exit");
				num = sc.nextInt();
				if (!(num > 0 && num < 6))
					throw new InvalidInputException("Input should be in between 1-5.");

				switch (num) {
				
				case 1: System.out.println("Enter the no. of Contacts you want to add: ");
						int a = sc.nextInt();
						
						for (int i = 0; i < a; i++) {
							System.out.println("Enter the \nName:  \nMobile Number:  ");
							String b = sc.next();
							long c = sc.nextLong();
							ct.add(new Contact(b, c));
						}
						break;
				
				case 2: System.out.println("Displaying all contacts:");
						for (Contact ctd : ct) {
							System.out.println(ctd.toString());
						}
						break;
						
				case 3: System.out.println("Enter the Name to view Contacts: ");
						String x = sc.next();
						for (Contact ctd : ct) {
							if (ctd.getName().equals(x))
								System.out.println(ctd);
						}
						break;
						
				case 4: System.out.println("Enter Contact number which needs to be removed:");
						long n = sc.nextLong();
						for (Contact ctd : ct) {
							if (ctd.getMobileNum()==n)
							{
								int i = ct.indexOf(ctd);
								ct.remove(i);
								break;
							}
						}
						break;
						
				case 5: System.out.println("Exit");
						flag = false;
						break;
						
				default: System.out.println("Invalid Input");
				}
			}
		}
		catch (InvalidInputException iie) {
			System.out.println(iie.getMessage());
		}
	}

}