package Animals;

public class Cat extends Animal{

	
	public Cat(int age, String race) {
		this.age = age;
		this.race = race;
	}

	@Override
	public void giveSound() {
		System.out.println("Miau.");
	}
}
