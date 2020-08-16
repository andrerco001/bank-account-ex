package br.com.dh.account;

import java.time.LocalDate;

import br.com.dh.customer.Customer;

public class SavingAccount extends Account {

	// attributes
	private static double interest = 0.02;

	// constructor methods
	public SavingAccount() {

	}

	public SavingAccount(int numberAccount, Customer customer, double balance, Type type, double interest) {
		super(numberAccount, customer, balance, type);
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
	public void payMonthlyInterest() {	
		LocalDate day = LocalDate.now();
		
		if(day.getDayOfMonth() == 5) {
			this.balance -= getInterest();
		}
	}
}
