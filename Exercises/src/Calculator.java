import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		Scanner symbols = new Scanner(System.in);
		int fnum, snum, result;
		String calculationSymbol;
		System.out.println("To jest prosty kalkulator, kt�ry wykonuje nast�puj�ce dzia�ania na liczbach ca�kowitych: dodawanie (+), odejmowanie (-), mno�enie (*), dzielenie (/) lub obliczenie modulo (%).");
		System.out.println("Podaj pierwsz� liczb�:");
		fnum = numbers.nextInt();
		System.out.println("Podaj drug� liczb�:");
		snum = numbers.nextInt();
		System.out.println("Podaj znak dzia�ania: +, -, *, / lub %");
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
			System.out.println("B��dny znak dzia�ania!!!");
			break;
		}
	}
}
