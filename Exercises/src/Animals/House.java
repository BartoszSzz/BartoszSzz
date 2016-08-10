package Animals;

public class House {
	public static void main(String[] args) {
		Animal puszek = new Cat(5, "maincoon");
		Animal gutek = new Dog(7, "default");
		System.out.println(puszek.getAge() + " " + puszek.getRace());
		puszek.giveSound();
		System.out.println(gutek.getAge() + " " + gutek.getRace());
		gutek.giveSound();
	}
}
