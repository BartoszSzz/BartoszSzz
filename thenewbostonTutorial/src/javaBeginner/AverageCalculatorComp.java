package javaBeginner;

import java.util.Scanner;

// aplikacja liczy œredni¹ z dowolnej iloœci liczb
// mo¿na j¹ udoskonaliæ wprowadzajc mo¿liwoœæ podania liczb przez u¿ytkownika
public class AverageCalculatorComp {
	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		System.out.println("Podaj liczby, z których chcesz wyliczyæ œredni¹");
		double[] numbersArray;
		numbersArray = new double[10];
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = numberScanner.nextDouble();
		}
		
		//System.out.println(average(12,43,54,74,24));	
	}
	
	public static double average(double...number) {
		double total=0;
		for(double x:number) {
			total+=x;
		}
		return total/number.length;
	}
}
