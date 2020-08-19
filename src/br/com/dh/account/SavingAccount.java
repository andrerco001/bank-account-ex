package br.com.dh.account;

import java.time.LocalDate;

import br.com.dh.customer.Customer;

public class SavingAccount extends Account {

	// attributes
	private double interest;

	// constructor methods
	public SavingAccount() {

	}

	public SavingAccount(int numberAccount, Customer customer, double balance, TypeAccount type, double interest) {
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
		double monthlyInterest = 0.0;
		
		if(day.getDayOfMonth() == 18) {
			 this.balance -= ((this.balance * getInterest()) / 100);
			 monthlyInterest = ((this.balance * getInterest()) / 100);
		}
		
		// System.out.println("Value of monthly interest applied to the account: $"+ monthlyInterest );
		System.out.printf("Value of monthly interest applied to the account: $%.2f\n", monthlyInterest );
	}

	@Override
	public String toString() {
		return "SavingAccount [ numberAccount: " + numberAccount + ", customer: " + customer + ", balance: " + balance
				+ ", type: " + type.getName() + ", interest: " + interest + " ]";
	}
	
}
