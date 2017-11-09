package studentdb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
	//variables
	private static int ID = 1001;
	private String userID;
	private String name;
	private String surname;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private List<String>courses = new ArrayList<String>();
	private double balance;
	
	//constructor
	public Student (String name, String surname, String ssn) {
		this.name = name;
		this.surname = surname;
		this.ssn = ssn;
		this.email = createEmail(name, surname);
		ID++;
		userID = generateUserID (Integer.toString(ID), this.ssn);
		System.out.println("User created!");
		System.out.println("Name: " + name + " " + surname + ", SSN: " + this.ssn);
		System.out.println("Email: " + email);
		System.out.println("UserID: " + userID);
	}
	
	//private methods	
	private String createEmail (String name, String surname) {
		return name.toLowerCase() + "." + surname.toLowerCase() + "@studentmail.edu";
	}
	
	private String generateUserID (String id, String ssn) {	
		return id + "" + (new Random().nextInt(9000-1000)+1000) + this.ssn.substring(5, 10);
	}
	
	//public methods
	
	public void enroll(String courseName) {
		this.courses.add(courseName);
		System.out.println(courseName + " added!");
	}
	
	public void showCourses() {
		for (int x=0; x < courses.size(); x++) {
			System.out.println(courses.get(x));
		}
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public void pay(double amount) {
		balance = balance + amount;
		System.out.println("You paid $" + amount + ". Your current balance is $" + balance);
	}
}

