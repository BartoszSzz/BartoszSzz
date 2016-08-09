package tutorials.basic;

public class Loops {
	public static void main(String[] args) {
		
		doWhileLoop();
		//whileLoop();	
		forLoop();
	}
	// pêtla while jest rzadko u¿ywana	
	static void whileLoop() {
		int counter = 0;
		while(counter < 10) {
			counter = counter + 1;
			System.out.println(counter);
		}
	}
	
	// do while jest u¿ywany, ¿eby wykonaæ pêtlê przynajmniej raz
	static void doWhileLoop() {
		int counter = 20;
		do {
			counter = counter + 1;
			System.out.println(counter);
		} while (counter < 10);
	}
	
	static void forLoop() {
		// for(initialize counter; condition to see if we should run the loop; change counter variable)
		for(int counter = 1; counter < 10; counter = counter + 1) {
			System.out.println(counter);
		}
	}
}
