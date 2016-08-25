package javaBeginner;

import java.util.Scanner;

public class AverageCalculatorSimple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int number;
		int average;
		int counter = 1;
		System.out.println("Podaj 10 liczb:");
		while (counter <= 10){
			number = input.nextInt();
			total = total + number;
			counter++;
		}
		average = total/10;
		System.out.println("Œrednia wynosi: " + average);
	}
}
