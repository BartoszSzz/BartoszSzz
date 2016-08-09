// Klasa Turtle jest subkas¹ klasy Reptile - Turtle is-a Reptile

public class Turtle extends Reptile {
	public static void main(String[] args) {
		Turtle edward = new Turtle();
		
		System.out.println("Turtle reproducts by " + edward.reproduction);
	}
}
