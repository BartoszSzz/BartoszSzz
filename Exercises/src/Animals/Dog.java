package Animals;

//Klasa Dog jest subkas� klasy Animal - Dog is-a(n) Animal
public class Dog extends Animal{

	public Dog(int age, String race) {
		this.age = age;
		this.race = race;
	}

	@Override // nadpisywanie (rzadziej u�ywane: przeci��anie) motody
	public void giveSound() {
		System.out.println("How.");
	}
}
