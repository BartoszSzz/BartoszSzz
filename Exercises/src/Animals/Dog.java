package Animals;

public class Dog extends Animal{

	public Dog(int age, String race) {
		this.age = age;
		this.race = race;
	}

	@Override // nadpisywanie (rzadziej używane: przeciążanie) motody
	public void giveSound() {
		System.out.println("How.");
	}
}
