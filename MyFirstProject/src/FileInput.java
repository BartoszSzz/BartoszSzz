import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) {
		File file = new File("Text.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

}
