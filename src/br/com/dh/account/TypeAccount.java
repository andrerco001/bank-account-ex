package br.com.dh.account;

public enum TypeAccount {
	
	CHECKING_ACCOUNT(1, "Checking Account"), 
	SAVING_ACCOUNT(2, "Saving Account");
	
	private int type;
	private String name;
	
	TypeAccount(int type, String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
