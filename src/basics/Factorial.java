package basics;

public class Factorial {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		int r = 0;
		if (n <= 1) {
			return 1;
		}
		else {			
			r = n * factorial(n - 1);			
			return r;			
		}		
	}
}
