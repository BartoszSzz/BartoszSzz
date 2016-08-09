package tutorials.basic;

public class Scope {
	
	// x jest zdeklarowane poza metodami, a wiêc jest w zakresie wszystkich metod
	// ka¿da metoda mo¿e uzyskaæ dostêp do x
	static int x; // deklaracja zmiennej x
	
	public static void main(String[] args) {
		x = 5; // przypisanie wartoœci zmiennej x
		System.out.println(x);
		
		doSomething();
		System.out.println(x);
	}
	
	static void doSomething() {
		x = 10;
	}
	
	static void doSomethingLocally() {
		// y jest zadeklarowane wewn¹trz tej metody, a wiêc y jest lokaln¹ zmienn¹
		// ¿adna inna metoda nie ma dostêpu do y
		int y = 100; // zadeklarowanie zmiennej i nadanie jej wartoœci
	}
}
