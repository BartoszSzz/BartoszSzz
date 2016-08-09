package tutorials.basic;

public class Scope {
	
	// x jest zdeklarowane poza metodami, a wi�c jest w zakresie wszystkich metod
	// ka�da metoda mo�e uzyska� dost�p do x
	static int x; // deklaracja zmiennej x
	
	public static void main(String[] args) {
		x = 5; // przypisanie warto�ci zmiennej x
		System.out.println(x);
		
		doSomething();
		System.out.println(x);
	}
	
	static void doSomething() {
		x = 10;
	}
	
	static void doSomethingLocally() {
		// y jest zadeklarowane wewn�trz tej metody, a wi�c y jest lokaln� zmienn�
		// �adna inna metoda nie ma dost�pu do y
		int y = 100; // zadeklarowanie zmiennej i nadanie jej warto�ci
	}
}
