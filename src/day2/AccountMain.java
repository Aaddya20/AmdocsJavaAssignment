package day2;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa = new SavingAccount(5000.00);
		sa.interest();
		CheckingAccount ca = new CheckingAccount(5000.00);
		ca.interest();
	}

}
