package basics;

public class MinMaxAvg {
	public static void main(String[] args) {
		int[] n = {1, 345, -34, 5, 12, 500};
		System.out.println(minimal(n));
		System.out.println(maximal(n));
		System.out.println(avg(n));
	}
	
	// minimal value of the array
	public static int minimal(int[] n) {
		int r = 0;		
		for (int x = 0; x < n.length; x++) {
			if (x == 0) {
				r = n[0];
			}
			else if (n[x] < r) {
				r = n[x];
			}
		}		
		return r;		
	}
	
	// maximal value of the array
	public static int maximal(int[] n) {
		int r = 0;		
		for (int x = 0; x < n.length; x++) {
			if (x == 0) {
				r = n[0];
			}
			else if (n[x] > r) {
				r = n[x];
			}
		}		
		return r;		
	}
	
	//average value of the array
	public static double avg(int[] n) {
		int r = 0;		
		for (int x = 0; x < n.length; x++) {
			r = r + n[x];
		}		
		return r / n.length;		
	}
	
}
