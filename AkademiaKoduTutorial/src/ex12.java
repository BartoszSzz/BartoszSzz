import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		do{
			System.out.println("Podaj has�o");
			password = input.nextLine();
		} while (!password.equals("Akademia"));
		input.close();
		System.out.println("Gratulacje! Poda�e� poprawne has�o");
	}

}
