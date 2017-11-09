package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(multipleNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("Adam");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(sum);
	}
	
	static int multipleNumbers(int numberA, int numberB) {
		return numberA * numberB;
	}
	

}
