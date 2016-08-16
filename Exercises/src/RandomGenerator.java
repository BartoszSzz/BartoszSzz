import java.util.Random;
// aplikacja genruj¹ca losowe liczby
public class RandomGenerator {
	public static void main(String[] args) {
		Random object = new Random();
		int number;
		
		for(int counter = 1; counter <= 10; counter++) { // counter<=10 oznacza, ¿e wyœwietlone ostanie 10 liczb
			number = 1+object.nextInt(15); // liczba 15 oznacza, ¿e wyœwietlone zostan¹ liczby losowe w zakresie od 0-14 (bo tak liczy komputer). W tym przypadku zero nas nie interesuje, dlatego za znakiem równa siê dodano "1+"
			System.out.println(number);
		}
	}
}
