package FiguryGeometryczne;
// ctrl + O wy�wietla wszystkie pola i metody z tej klasy, a drugi raz ctrl + O wszystkie pola i metody w tej klasie i we wszystkich po kt�rych dziedziczy
public class Application {
	public static void main(String[] args) {
		Czworobok one = new Kwadrat(-1);
		Czworobok two = new Prostokat(7, 0);
		Czworobok three = new Rownoleglobok(1, 1, 100);
		Czworobok four = new Trapez(2, 6, 4, 4, 0);
		System.out.println("Pole kwadratu " + one.liczeniePola());
		System.out.println("Pole prostok�ta " + two.liczeniePola());
		System.out.println("Obw�d kwadratu " + one.liczenieObwodu());
		System.out.println("Obwod prostok�ta " + two.liczenieObwodu());
		System.out.println("Pole rownoloegloboku " + three.liczeniePola());
		System.out.println("Obw�d rownolegloboku " + three.liczenieObwodu());
		System.out.println("Pole trapezu " + four.liczeniePola());
		System.out.println("Obwod trapezu " + four.liczenieObwodu());
	}
}
