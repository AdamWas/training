package oop;

public class BankAccount {
	String accountNumber;
	String routingNumber;
	String name;
	String ssn;
	String accountType;
	
	//Constructor
	BankAccount(){
		System.out.println("new account created");
	}
	
	BankAccount(String accountType){
		System.out.println("new account created - " + accountType);
		accountType = accountType;
	}
	
	//methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
}
