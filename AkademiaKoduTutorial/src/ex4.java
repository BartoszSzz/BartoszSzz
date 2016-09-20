import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹:");
		int number = input.nextInt();
		input.close();
		if(number > 0) {
			System.out.println("Liczba dodatnia");
		} else if(number < 0) {
			System.out.println("Liczba ujemna");
		} else {
			System.out.println("liczba równa zero");
		}
	}
}
