import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		do{
			System.out.println("Podaj has³o");
			password = input.nextLine();
		} while (!password.equals("Akademia"));
		input.close();
		System.out.println("Gratulacje! Poda³eœ poprawne has³o");
	}

}
