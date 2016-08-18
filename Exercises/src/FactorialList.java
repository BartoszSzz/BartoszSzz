// ta aplikacja ma na celu wrzucenie wynik�w silni do tablicy

public class FactorialList {
	public static void main(String[] args) {
		int[] listArray;
		int n = 16; // liczba, dla kt�rej obliczana jest silnia
		int number = n + 1;
		listArray = new int[number];
		
		// p�tla kt�ra wy�wietla numer miejsca w tablicy i warto�� przypisan� do tego miejsca
		System.out.println("Index\tNumber");
		for(int counter = 0; counter<listArray.length; counter++) {
			listArray[counter] = calculateFactorial(counter);
			System.out.println(counter + "\t" + listArray[counter]);
		}
	}

		// metoda obliczaj�ca silni�
		public static int calculateFactorial(int n) {
			int result = 1;
			for(int counter = 1; counter <= n; counter++) {
				result = result * counter;
			}
			return result;
		}
}
