package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Price_item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the no. of items: ");
		try
		{
			n = sc.nextInt();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter the integer value for no. of items.");
		}
		try
		{
			String[] item_name = new String[n];
			int[] price = new int[n];
			for(int i=0; i<price.length; i++)
			{
				System.out.println("Enter the name of item "+i +"  :");
				item_name[i] = sc.next();
				System.out.println("Enter the price for item "+i +"  :");
				price[i] = sc.nextInt();
			}
			System.out.println("Enter the index value of item: ");
			int index = sc.nextInt();
			System.out.println("Item Name: " + item_name[index] + "\nItem Price: " + price[index]);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter the integer value as price");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound: Type right Index Value");
		}
	}

}
