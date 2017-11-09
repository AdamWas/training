package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		//BankAccount acc1 = new BankAccount("313224323");
		//BankAccount acc2 = new BankAccount("333224323");
		//BankAccount acc3 = new BankAccount("333224323");
		//acc1.setName("Jim");
		//System.out.println(acc1.getName());

	}

}


class BankAccount {
	private static int ID = 1001;
	private String accountNmber;
	private static final String routingNumber = "0045040000";
	private String name;
	private String ssn;
	private double balance;
	
	public BankAccount(String ssn, double initDeposit) {
		this.ssn = ssn;		
		ID++;
		balance = initDeposit;
		System.out.println("New account created. ID: " + ID);
		setAccountNumber();		
	}
	
	private void setAccountNumber() {		
		int random = (int) (Math.random() * 100);
		accountNmber = ID + "" + random + "" + ssn.substring(0, 2);
		System.out.println("Your account number: " + accountNmber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill (double amount) {
		balance = balance - amount;
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
	}
	
}