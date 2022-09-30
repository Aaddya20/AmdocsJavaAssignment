package day10_test;

public class ShoppingCart {

	private String name;
	private double amount;
	
	public ShoppingCart(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ShoppingCart [name=" + name + ", amount=" + amount + "]";
	}
	
}
