package tutorials.basic;

public class Person {
	String name;
	int age;
	
	public Person(String name) {
		this.name = name; // s³owo kluczowe 'this' wskazuje, ¿e chodzi o zmienn¹ globaln¹ 'name'
		System.out.println("Person created"); // ten komunikat powoduje, ¿e ka¿de utworzenie nowej osoby bêdzie wi¹za³o siê z wyœwietleniem tego napisu
	}

	// metody get i set zosta³y wygenerowane automatycznie po u¿yciu funkcji w eclipse 'Generate Getters and Setters'
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) { // 'Person' jest dwa razy, bo pierwsze s³owo to nazwa klasy, a druga to nazwa zmiennej
		System.out.println(getName() + " said Hello to " + person.getName());
	}
}
