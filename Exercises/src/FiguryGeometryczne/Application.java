package FiguryGeometryczne;
// ctrl + O wy�wietla wszystkie pola i metody z tej klasy, a drugi raz ctrl + O wszystkie pola i metody w tej klasie i we wszystkich po kt�rych dziedziczy
public class Application {
	public static void main(String[] args) {
		Czworobok one = new Kwadrat(3);
		Czworobok two = new Prostokat(7, 1);
		Czworobok three = new Rownoleglobok(2, 3, 5);
		Czworobok four = new Trapez(2, 5, 5, 4, 4);
		Trojkat five = new Trojkat(5, 5, 6, 4);
		Kolo six = new Kolo(12.4);
		System.out.println("Pole kwadratu " + one.liczeniePola());
		System.out.println("Obw�d kwadratu " + one.liczenieObwodu());
		System.out.println("Pole prostok�ta " + two.liczeniePola());
		System.out.println("Obwod prostok�ta " + two.liczenieObwodu());
		System.out.println("Pole rownoloegloboku " + three.liczeniePola());
		System.out.println("Obw�d rownolegloboku " + three.liczenieObwodu());
		System.out.println("Pole trapezu " + four.liczeniePola()); // warunki kompletne; konieczna zmiana typu danych na double
		System.out.println("Obwod trapezu " + four.liczenieObwodu()); // warunki kompletne; konieczna zmiana typu danych na double
		System.out.println("Pole tr�jk�ta " + five.liczeniePola()); // brakuje warunku dla tr�jk�ta rozwartok�tnego
		System.out.println("Obw�d tr�jk�ta " + five.liczenieObwodu()); // brakuje warunku dla tr�jk�ta rozwartok�tnego
		System.out.println("Pole ko�a " + six.liczeniePola()); // warunki kompletne
		System.out.println("Obw�d ko�a " + six.liczenieObwodu()); // warunki kompletne
	} // dopisa� formu�y, dzi�ki kt�rym pola i obwody nie wy�wietla�yby si� je�li figura b�dzie niepoprawna
}
