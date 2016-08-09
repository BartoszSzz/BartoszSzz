package tutorials.basic;

public class Arrays {
	public static void main(String[] args) {
		int x; // creating one box in memory that store one int value
		int[] myArray; // declaring an array that will store ints
		myArray = new int[50000]; // initializing our array to be capable of holding 50000 ints
		
		/* przyk³adowy myArray dla czterech ró¿nych wartoœci
		myArray = new int[4]; // initializing our array to be capable of holding 4 ints
		myArray = new int[] {5,3,0,1}; // to polecenie mo¿na u¿yæ zamias powy¿szego i wtedy nie potrzebne jest poni¿sze wypisywanie poszczególnych liczb - myArray wype³ni siê liczbami znajduj¹cymi siê w nawiasie klamrowym
		
		x = 5;
		
		myArray[0] = x; // first box holds x. W nawiazach kwadratowach s¹ numery pude³ek, przy czym pierwsze ma numer 0
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		*/
		
		// ta pêtla uzupe³nia myArray liczbami od 0 do 49999
		for(int counter = 0; counter <50000; counter ++) {
			myArray[counter] = counter;
		}
		
		// iterating over an array
		// obie poni¿sze pêtle wykonuja to samo (wyœwietlaj¹ wszystkie wartoœci zapisane do myArray), dlatego wykomentowana jest ta o bardziej skomplikowanym zapisie
		/*
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		*/
		
		for(int number : myArray) {
			System.out.println(number);
		}
	}
}
