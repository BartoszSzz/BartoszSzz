
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
			counter++; // w while inkrementacja jest zawsze na koñcu
		}
		return result;
	}
	
	public static int doFactorialCalculation(int n) {
		int counter = 1;
		int result = 1;
		// ta pêtla wykona siê co najmniej raz. Oznacza to, ¿e jeœli ustawi siê counter = 5 lub wiêcej, to pêtla wyœwietli tylko tê liczbê.
		do {
			result = result * counter;
			counter++;
		} while (counter <= n);
		return result;
	}
}
