import java.util.Scanner;

public class exP34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczb� galon�w:");
		double amountG = input.nextDouble();
		input.close();
		double amountL = amountG * 3.7854;
		System.out.println("Obj�to�c w litrach: " + amountL);

	}

}
