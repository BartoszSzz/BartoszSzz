import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê:");
		int number1 = input.nextInt();
		System.out.println("Podaj drug¹ liczbê:");
		int number2 = input.nextInt();
		input.close();
		if(number1 > number2){
			System.out.println("Wiêksza jest pierwsza liczba i wynosi: " + number1);
		} else if (number1 < number2){
			System.out.println("Wiêksza jest druga liczba i wynosi: " + number2);
		} else {
			System.out.println("Liczby s¹ sobie równe.");
		}
	}

}
