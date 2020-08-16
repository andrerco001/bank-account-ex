package br.com.dh.account;

public class CheckingAccount extends Account {
	
	// attributes
	private double overdraftCheckLimit;
	
	// constructor methodes
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(double overdraftCheckLimit) {
		super();
		this.overdraftCheckLimit = overdraftCheckLimit;
	}
	
	// getters and setters
	public double getOverdraftCheckLimit() {
		return overdraftCheckLimit;
	}

	public void setOverdraftCheckLimit(double overdraftCheckLimit) {
		this.overdraftCheckLimit = overdraftCheckLimit;
	}
	
	// methods

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
