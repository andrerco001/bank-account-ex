package br.com.dh.account;

public class SavingAccount extends Account {
	
	// attributes
	private double interest;
	
	// constructor methods
	public SavingAccount() {
		super();
	}

	public SavingAccount(double interest) {
		super();
		this.interest = interest;
	}
	
	// getters and setters
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	// methods
	public double payMonthlyInterest(double interest) {
		
		return 0;
	}

	@Override
	public double currentBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositCash(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdrawCash(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
