import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹.");
		int number = input.nextInt();
		input.close();
		System.out.println("Wynik zadania: " + number*5);
	}

}
