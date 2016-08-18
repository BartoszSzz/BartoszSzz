// ta aplikacja ma na celu wrzucenie wyników silni do tablicy

public class FactorialList {
	public static void main(String[] args) {
		int[] listArray;
		int n = 16; // liczba, dla której obliczana jest silnia
		int number = n + 1;
		listArray = new int[number];
		
		// pêtla która wyœwietla numer miejsca w tablicy i wartoœæ przypisan¹ do tego miejsca
		System.out.println("Index\tNumber");
		for(int counter = 0; counter<listArray.length; counter++) {
			listArray[counter] = calculateFactorial(counter);
			System.out.println(counter + "\t" + listArray[counter]);
		}
	}

		// metoda obliczaj¹ca silniê
		public static int calculateFactorial(int n) {
			int result = 1;
			for(int counter = 1; counter <= n; counter++) {
				result = result * counter;
			}
			return result;
		}
}
