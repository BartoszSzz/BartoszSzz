package tutorials.basic;

public class Conditionals {
	public static void main(String[] args) {
		
		// if - sprawdza pewne twierdzenie
		// i robi coœ
		
		boolean sayHello = false;
		boolean sayHey = true;
		
		// only the first statement evaluate to true gets executed
		if(sayHello) {
			System.out.println("Hello");
		} else if (sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}
		
		// rodzaje wwarunków: <, >, <=, >=, !=, ==
		// if(x = 5) przypisuje liczbê 5 do zmiennej x
		// if(x == 5) sprawdza warunke czy x jest równe 5
		
		// && klauzula AND
		// || klauzula OR
		
		int playerX = 50;
		
		if(true && false) {
			System.out.println("AND executed");
		}
		
		// if our player is past the left side of the screen, or if our player is past the right side of the screen
		if(playerX < 0 || playerX > 800) {
			// some code that reverses our player's direction
			System.out.println("OR executed");
		}
	}
}
