import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner temperatureScanner = new Scanner(System.in);
		Scanner unitScanner = new Scanner(System.in);
		double temperature;
		String unit;
		System.out.println("Podaj temperaturê");
		temperature = temperatureScanner.nextDouble();
		
		System.out.println("Podaj jednostkê: C (Celsjusz) lub F (Fahrenheit");
		unit = unitScanner.nextLine();
		
		double result;
		switch (unit) {
		case "F":
			result = (temperature - 32) * 5/9;
			System.out.println("Jest " + result + " stopni Celsjusza");
			break;
		case "C":
			result = temperature * 9/5 + 32;
			System.out.println("Jest " + result + " stopni Fahrenheita");
			break;
		default:
			System.out.println("Poda³eœ b³êdn¹ jednostkê. Napisz: C lub F");
		}
		temperatureScanner.close();
		unitScanner.close();
	}
}
