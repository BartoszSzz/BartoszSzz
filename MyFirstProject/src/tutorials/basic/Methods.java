package tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		sayHelloWorld(); // ta linijka powoduje, �e metoda 1 si� wykonuje
		sayHelloTo("Charlie"); // ta linijka powoduje, �e metoda 2 si� wykonuje
		
		int x = returnFive(); // deklaracja zmiennej jako metody
		System.out.println(x); // wy�wietlenie zmiennej
		
		int result = square(returnFive());
		System.out.println(result);
	}
	
	// Metoda 4, kt�ra wykonuje obliczenie
	static int square(int x) {
		return x * x;
	}
	
	// Metoda 3, kt�ra zwraca liczby
	static int returnFive() { 
		return 5;
	}
	
	// Metoda 2 ze zmienn� 'name'
	static void sayHelloTo(String name) { 
		System.out.println("Hello, " + name);
	}
	
	// Metoda 1
	static void sayHelloWorld() { 
		System.out.println("Hello,World!");
	}
	
}
