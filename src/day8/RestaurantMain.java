package day8;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Waiter q=new Waiter();
		new Chef(q);
		new Customer(q);

	}

}
