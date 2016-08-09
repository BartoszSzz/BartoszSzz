package tutorials.basic;

public class Arrays {
	public static void main(String[] args) {
		int x; // creating one box in memory that store one int value
		int[] myArray; // declaring an array that will store ints
		myArray = new int[50000]; // initializing our array to be capable of holding 50000 ints
		
		/* przyk�adowy myArray dla czterech r�nych warto�ci
		myArray = new int[4]; // initializing our array to be capable of holding 4 ints
		myArray = new int[] {5,3,0,1}; // to polecenie mo�na u�y� zamias powy�szego i wtedy nie potrzebne jest poni�sze wypisywanie poszczeg�lnych liczb - myArray wype�ni si� liczbami znajduj�cymi si� w nawiasie klamrowym
		
		x = 5;
		
		myArray[0] = x; // first box holds x. W nawiazach kwadratowach s� numery pude�ek, przy czym pierwsze ma numer 0
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		*/
		
		// ta p�tla uzupe�nia myArray liczbami od 0 do 49999
		for(int counter = 0; counter <50000; counter ++) {
			myArray[counter] = counter;
		}
		
		// iterating over an array
		// obie poni�sze p�tle wykonuja to samo (wy�wietlaj� wszystkie warto�ci zapisane do myArray), dlatego wykomentowana jest ta o bardziej skomplikowanym zapisie
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
