package day2;

public class CheckingAccount extends Account{

	private double rate = 0.04;
	private double res;

	public CheckingAccount(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void interest() {
		// TODO Auto-generated method stub
		res = amount + (rate*amount);
		System.out.println("Checking Account: "+res);
	}
}
