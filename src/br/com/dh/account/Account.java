package br.com.dh.account;

import br.com.dh.customer.Customer;

public abstract class Account {
	
	// attributes
	protected int numberAccount;
	protected Customer customer;
	protected double balance;
	protected TypeAccount type;

	// constructor methods
	public Account() {

	}

	public Account(int numberAccount, Customer customer, double balance, TypeAccount type) {
		this.numberAccount = numberAccount;
		this.customer = customer;
		this.balance = balance;
		this.type = type;
	}

	// getters and setters
	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public TypeAccount getType() {
		return type;
	}

	public void setType(TypeAccount type) {
		this.type = type;
	}

	// methods
	public double currentBalance() {

		return this.balance;
	}

	public void depositCash(double amount) {
		
		if(amount > 0) {
			this.balance += amount;
			System.out.println("New deposit: " + amount);
		} else {
			System.out.println("The amount to be deposited must be greater than zero.!");
		}
	}

	public void withdrawCash(double amount) {
		
		if(((this.getBalance() - amount) >= 0) && amount > 0) {
			this.balance -= amount;
		} else {
			System.out.println("Unable to withdraw. Check the amount informed.!");
		}
	}

	@Override
	public String toString() {
		return "Account [ numberAccount: " + numberAccount + ", customer: " + customer + ", balance: " + balance + ", type: "
				+ type.getName() + " ]";
	}
	
	
}