package oops;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit amount is "+depositAmount+" Balance available is "+this.balance);
	}
	
	public void withdrawl(double withdrawlAmount) {
		if(this.balance-withdrawlAmount<=0) {
			System.out.println("insufficient balance : "+this.balance);
		}
		else {
			this.balance -=withdrawlAmount;
			System.out.println("withdrawl successfull of amount : "+withdrawlAmount+" , Balance available : "+this.balance);
		}
	}
	
	public void setNumber(String number) {
		this.number = number; 	
	}
	public String getNumber() {
		return this.number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 	
	}
	public double getBalance() {
		return this.balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName; 	
	}
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail; 	
	}
	public String getCustomerEmail() {
		return this.customerEmail;
	}


}
