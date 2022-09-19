package day2;

public class SavingAccount extends Account{

	private double rate = 0.05;
	private double res;
	
	public SavingAccount(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	void interest() {
		//System.out.println(getAmount());
		res = amount + (rate*amount);
		System.out.println("Saving Account: "+res);
	}

}
