import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Jak masz na imi�?");
		String name = input.nextLine();
		input.close();
		if(name.equals("Ewelina") || name.equals("Ewelinka")){
			System.out.println("Jeste� S�oneczkiem :)");
		} else if(name.equals("Gutek") || name.equals("Augustyn") || name.equals("Guni")) {
			System.out.println("Na pewno nie jeste� psem :P");
		} else if(name.equals("Bartek") || name.equals("Bartosz") || name.equals("Bartu�")){
			System.out.println("Jeste� Kocurem ;)");
		} else {
			System.out.println("Nie znam Ci� :(");
		}
		}

}
