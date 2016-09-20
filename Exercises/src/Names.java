import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Jak masz na imiê?");
		String name = input.nextLine();
		input.close();
		if(name.equals("Ewelina") || name.equals("Ewelinka")){
			System.out.println("Jesteœ S³oneczkiem :)");
		} else if(name.equals("Gutek") || name.equals("Augustyn") || name.equals("Guni")) {
			System.out.println("Na pewno nie jesteœ psem :P");
		} else if(name.equals("Bartek") || name.equals("Bartosz") || name.equals("Bartuœ")){
			System.out.println("Jesteœ Kocurem ;)");
		} else {
			System.out.println("Nie znam Ciê :(");
		}
		}

}
