package Animals;

public class Cat extends Animal{

	
	public Cat(int age, String race) {
		this.age = age;
		this.race = race;
	}

	@Override // nadpisywanie (rzadziej u¿ywane: przeci¹¿anie) motody
	public void giveSound() {
		System.out.println("Miau.");
	}
}
