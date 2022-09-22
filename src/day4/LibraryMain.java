package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Library> lib =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("Choose any one from the following: \n1>Add new Member \n2>View All member details \n3>View detail by address \n4>Exit\n");
			int num=sc.nextInt();
			
			switch(num)
			{
			case 1: System.out.println("Enter the Number of Member you want to add in the library: ");
					int a=sc.nextInt();
					for(int i=0;i<a;i++)
					{
						System.out.println("Enter the \nname:  \nAddress:  \nUnique_id: \nage: ");
						String b=sc.next();
						String c=sc.next();
						int d=sc.nextInt();
						int e=sc.nextInt();
						lib.add(new Library(b,c,d,e));
					}
					break;
			case 2: for(Library lam: lib)
					{
						System.out.println(lam.toString());
					}
					break;
			case 3: System.out.println("Enter the Address to view Detail of Member: ");
					String y=sc.next();
					for(Library lam: lib)
					{
						if(lam.getAddress().equals(y))
							System.out.println(lam);
					}
					break;
			case 4: System.out.println("Exit");
					flag=false;
					break;
			default: System.out.println("Invalid Input");
			}
		}
	}

}
