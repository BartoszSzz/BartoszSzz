public class App {
	
	public static void main(String[] args) {		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + ": " + checkIfEvenNumber(i));
		}

	}

	public static boolean checkIfEvenNumber(int numberToCheck) {
		boolean isEven = false;
		
		if((numberToCheck % 2) == 0) {
			isEven = true;
		}
		
		return isEven;
	}
}