package oops;

public class Bankmain {
	public static void main(String[] args) {
		Account mannu = new Account();
		
		mannu.setCustomerName("Ashish Kumar");
		System.out.println("Account Holder Name : "+mannu.getCustomerName());
		mannu.setNumber("72030640158");
		System.out.println("Account number is   : "+mannu.getNumber());
		mannu.setCustomerEmail("ashishch998@gmail.com");
		System.out.println("Email Address       : "+mannu.getCustomerEmail());
		System.out.println("");
		
		mannu.setBalance(0.00);
		
		
		mannu.deposit(5000.0);
		mannu.deposit(2000.0);
		
		mannu.withdrawl(1500.0);
		
		
	}

}
