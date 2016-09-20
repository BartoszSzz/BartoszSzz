import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹:");
		int number = input.nextInt();
		input.close();
		System.out.println("Ostatnia cyfra tej liczby to: " + number%10);
		// dlaczego takie dzia³anie? - wynika to z systemu pozycyjnego
	}

}
