package day10_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<String, ShoppingCart> cartMap = new HashMap<String, ShoppingCart>();
		int num;
		
		System.out.print("Welcome to Shopping Mart!!");
		try {
			boolean flag = true;
			while (flag) {
				System.out.println("\nChoose any one from the following: \n1.Add new items \n2.Delete items \n3.View total amount \n4.View amount by choosing category \n5.Exit");
				num = sc.nextInt();
				if (!(num > 0 && num < 6))
					throw new InvalidInputException("Input should be in between 1-5.");

				switch (num) {
				
				case 1: System.out.println("Enter the no. of Items you want to add: ");
						int a = sc.nextInt();
						
						for (int i = 0; i < a; i++) {
							System.out.println("Enter the \nName:  \nAmount:  ");
							String b = sc.next();
							double c = sc.nextDouble();
							cartMap.put(b, new ShoppingCart(b,c));
						}
						break;
				
				case 2: System.out.println("Enter the Item which needs to be removed:");
						String nm = sc.next();
						for(Map.Entry<String, ShoppingCart> m: cartMap.entrySet()) {
							if(m.getKey().equals(nm)) {
								cartMap.remove(nm);
								break;
							}
						}
						break;
						
				case 3: System.out.println("View Total Amount----------");
					//Using Lamda Expression
						Double sum = cartMap.entrySet().stream().map(amt -> amt.getValue().getAmount()).reduce(0.0, (x,y) -> x+y);
						System.out.println("Total Cart Amount = "+sum);
						break;
						
				case 4: System.out.println("View Amount by Category-----");
						System.out.println("Enter the Item: ");
						String cat = sc.next();
						for(Map.Entry<String, ShoppingCart> m: cartMap.entrySet()) {
							if(m.getKey().equals(cat)) {
								System.out.println("Amount of "+m.getKey()+" = "+m.getValue().getAmount());
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
