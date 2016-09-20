import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹:");
		int number = input.nextInt();
		input.close();
		if(number % 2 == 0) {
			System.out.println("Liczba jest dodatnia");
		} else {
			System.out.println("liczba jest ujemna");
		}
	}

}
