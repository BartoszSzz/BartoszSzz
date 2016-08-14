import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		Scanner symbols = new Scanner(System.in);
		int fnum, snum, result;
		String calculationSymbol;
		System.out.println("To jest prosty kalkulator, który wykonuje nastêpuj¹ce dzia³ania na liczbach ca³kowitych: dodawanie (+), odejmowanie (-), mno¿enie (*), dzielenie (/) lub obliczenie modulo (%).");
		System.out.println("Podaj pierwsz¹ liczbê:");
		fnum = numbers.nextInt();
		System.out.println("Podaj drug¹ liczbê:");
		snum = numbers.nextInt();
		System.out.println("Podaj znak dzia³ania: +, -, *, / lub %");
		calculationSymbol = symbols.nextLine();
		
		switch (calculationSymbol) {
		case "+":
			result = fnum + snum;
			System.out.println("Wynik to: " + result);
			break;
		case "-":
			result = fnum - snum;
			System.out.println("Wynik to: " + result);
			break;
		case "*":
			result = fnum * snum;
			System.out.println("Wynik to: " + result);
			break;
		case "/":
			result = fnum / snum;
			System.out.println("Wynik to: " + result);
			break;
		case "%":
			result = fnum % snum;
			System.out.println("Wynik to: " + result);
			break;
		default:
			System.out.println("B³êdny znak dzia³ania!!!");
			break;
		}
	}
}
