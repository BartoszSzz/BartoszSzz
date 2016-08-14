package javaBeginner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		Scanner operation = new Scanner(System.in);
		double fnum, snum, result;
		String calculationSymbol;
		System.out.println("Podaj pierwsz¹ liczbê: ");
		fnum = numbers.nextDouble();
		System.out.println("Podaj drug¹ liczbê: ");
		snum = numbers.nextDouble();
		System.out.println("Podaj symbol dzia³ania: ");
		calculationSymbol = operation.nextLine();
		result = fnum + snum;
		System.out.println("Suma  to: " + result);
	}
}
