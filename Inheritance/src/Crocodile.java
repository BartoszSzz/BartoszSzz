// Klasa Crocodile jest subkas¹ klasy Reptile - Crocodile is-a Reptile

public class Crocodile extends Reptile {
	public static void main(String[] args) {
		Crocodile john = new Crocodile();
		
		System.out.println("Crocodile reproducts by " + john.reproduction);
	}
}
