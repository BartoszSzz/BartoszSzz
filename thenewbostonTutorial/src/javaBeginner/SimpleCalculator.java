package javaBeginner;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		double fnum, snum, result;
		System.out.println("Podaj pierwsz� liczb�: ");
		fnum = numbers.nextDouble();
		System.out.println("Podaj drug� liczb�: ");
		snum = numbers.nextDouble();
		result = fnum + snum;
		System.out.println("Suma  to: " + result);
	}
}
