import java.util.Scanner;

public class exP34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê galonów:");
		double amountG = input.nextDouble();
		input.close();
		double amountL = amountG * 3.7854;
		System.out.println("Objêtoœc w litrach: " + amountL);

	}

}
