
public class Factorial {
	public static void main(String[] args) {
	System.out.println(factorialCalculation(5));
	System.out.println(doFactorialCalculation(5));
	}
	public static int factorialCalculation(int n) {
		int counter = 1;
		int result = 1;
		while(counter <= n) {
			result = result * counter;
			counter++; // w while inkrementacja jest zawsze na ko�cu
		}
		return result;
	}
	
	public static int doFactorialCalculation(int n) {
		int counter = 1;
		int result = 1;
		// ta p�tla wykona si� co najmniej raz. Oznacza to, �e je�li ustawi si� counter = 5 lub wi�cej, to p�tla wy�wietli tylko t� liczb�.
		do {
			result = result * counter;
			counter++;
		} while (counter <= n);
		return result;
	}
}
