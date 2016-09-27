import java.util.Scanner;

public class TestP42Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj swoj¹ wagê");
		double weightEarth = input.nextDouble();
		input.close();
		double moonGravit = 0.15D; // "D" to oznaczenie sta³ej
		double weightMoon = weightEarth * moonGravit;
		System.out.println("Na Ksiê¿ycu wa¿y³byœ " + weightMoon + " kilogramów.");
	}

}
