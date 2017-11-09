package basics;

public class Cities {
	public static void main(String[] args) {
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		//System.out.println(states[1]);
		//states[3] = "Alaska";
		int i = 0;
		
		/*
		do {
			System.out.println(states[i]);
			i++;
		} while (i < states.length);
		
		
		int n = 0;
		boolean stateFound = false;
		while (n < states.length && !stateFound) {
			System.out.println(states[n]);
			if (states[n] == "Texas") {
				System.out.println("State found");
				stateFound = true;
				//n = states.length;
			}
			n++;
		}
		*/
		boolean stateFound = false;
		for (int x = 0; x < states.length && !stateFound; x++) {
			System.out.println(states[x]);
			if (states[x] == "Texas") {
				System.out.println("State found");
				stateFound = true;
			}
		}
		
	}
}
