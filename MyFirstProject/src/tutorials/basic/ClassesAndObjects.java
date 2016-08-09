package tutorials.basic;
public class ClassesAndObjects {
	public static void main(String[] args) {
		Person john = new Person("John");
		john.setAge(20);
		Person bob = new Person("Bob");
		bob.setAge(30); // Jeœli w klasie Person zmienn¹ 'age' poprzedzimy s³owem kluczowym static int, to zmienna 'age' bêdzie zawsze przyjmowaæ ostatni¹ wartoœæ jaka jest podana w kodzie
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old");
	}
}
