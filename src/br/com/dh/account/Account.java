package br.com.dh.account;

import br.com.dh.customer.Customer;

public abstract class Account {
	
	enum Type {
		
		CHECKING, SAVING;
	}
	
	protected int numberAccount;
	protected Customer customer;
	protected double balance;
	protected Type type;
	
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

	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public abstract double currentBalance();
	
	public abstract double depositCash(double amount);
	
	public abstract double withdrawCash(double amount);
}