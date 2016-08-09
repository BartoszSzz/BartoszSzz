
public class Factorial {
	public static void main(String[] args) {
	System.out.println(factorialCalculation(5));
	System.out.println(doFactorialCalculation(5));
	}
	public static int factorialCalculation(int n) {
		int counter = 1;
		int result = 1;
		while(counter <= n) {
			result = result * counter + 1;
		}
		return result;
	}
	
	public static int doFactorialCalculation(int n) {
		int counter = 1;
		int result = 1;
		do {
			result = result * counter + 1;
		} while (counter <= n);
		return result;
	}
}
