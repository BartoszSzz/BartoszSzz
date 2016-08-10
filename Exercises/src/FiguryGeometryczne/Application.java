package FiguryGeometryczne;

public class Application {
	public static void main(String[] args) {
	Czworobok one = new Kwadrat(6);
	Czworobok two = new Prostokat(7, 8);
	System.out.println(one.liczeniePola());
	System.out.println(two.liczeniePola());
	}
}
