import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb�:");
		int number1 = input.nextInt();
		System.out.println("Podaj drug� liczb�");
		int number2 = input.nextInt();
		System.out.println("Podaj trzeci� liczb�");
		int number3 = input.nextInt();
		input.close();
		int maxNumber = Math.max(number3, Math.max(number1, number2));
		System.out.println("Najwi�ksza liczba to: " + maxNumber);
	}

}
