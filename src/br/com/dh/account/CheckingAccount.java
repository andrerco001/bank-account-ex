package br.com.dh.account;

import java.time.LocalDate;

import br.com.dh.customer.Customer;

public class CheckingAccount extends Account {

	// attributes
	private double overdraftCheckLimit;

	// constructor methods
	public CheckingAccount() {

	}

	public CheckingAccount(int numberAccount, Customer customer, double balance, String type,
			double overdraftCheckLimit) {
		super(numberAccount, customer, balance, type);
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
	public void depositCheck(double amount, String bank, LocalDate payDate) {
		
		payDate = LocalDate.now();
		
		if(amount > 0 && (bank != null && bank != "") && payDate.getDayOfMonth() == 10) {
			this.balance += amount;
		} else {
			System.out.println("The amount to be deposited must be greater than zero.!");
		}
	}

	@Override
	public void withdrawCash(double amount) {

		if (this.getBalance() >= 0 && amount > 0 && amount < this.getBalance()) {
			this.balance -= amount;
		} else if (this.getBalance() < 0 && amount > 0) {

			double amountoverdraftCheck = getOverdraftCheckLimit() - amount;
			setOverdraftCheckLimit(amountoverdraftCheck);
			this.balance -= amountoverdraftCheck;

		} else {
			System.out.println("Unable to withdraw. Check the amount informed.!");
		}
	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftCheckLimit: " + overdraftCheckLimit + ", numberAccount: " + numberAccount
				+ ", customer: " + customer + ", balance: " + balance + ", type: " + type + "]";
	}
}