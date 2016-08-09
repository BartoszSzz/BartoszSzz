
public class Silnia {
	public static void main(String[] args) {
	System.out.println(calculateFactorial(5));
	}
	public static int calculateFactorial(int n) {
		int result = 1;
		for(int counter = 1; counter <= n; counter++) {
			result = result * counter;
		}
		return result;
	}
}
