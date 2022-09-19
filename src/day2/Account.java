package day2;

public abstract class Account {

	public double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account(double amount) {
		super();
		this.amount = amount;
	}
	
	abstract void interest();
	
}