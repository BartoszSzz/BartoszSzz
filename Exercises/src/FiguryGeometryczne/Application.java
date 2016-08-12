package FiguryGeometryczne;
// ctrl + O wyœwietla wszystkie pola i metody z tej klasy, a drugi raz ctrl + O wszystkie pola i metody w tej klasie i we wszystkich po których dziedziczy
public class Application {
	public static void main(String[] args) {
		Czworobok one = new Kwadrat(3);
		Czworobok two = new Prostokat(7, 1);
		Czworobok three = new Rownoleglobok(2, 3, 5);
		Czworobok four = new Trapez(2, 5, 5, 4, 4);
		Trojkat five = new Trojkat(5, 5, 6, 4);
		Kolo six = new Kolo(12.4);
		System.out.println("Pole kwadratu " + one.liczeniePola());
		System.out.println("Obwód kwadratu " + one.liczenieObwodu());
		System.out.println("Pole prostok¹ta " + two.liczeniePola());
		System.out.println("Obwod prostok¹ta " + two.liczenieObwodu());
		System.out.println("Pole rownoloegloboku " + three.liczeniePola());
		System.out.println("Obwód rownolegloboku " + three.liczenieObwodu());
		System.out.println("Pole trapezu " + four.liczeniePola()); // warunki kompletne; konieczna zmiana typu danych na double
		System.out.println("Obwod trapezu " + four.liczenieObwodu()); // warunki kompletne; konieczna zmiana typu danych na double
		System.out.println("Pole trójk¹ta " + five.liczeniePola()); // brakuje warunku dla trójk¹ta rozwartok¹tnego
		System.out.println("Obwód trójk¹ta " + five.liczenieObwodu()); // brakuje warunku dla trójk¹ta rozwartok¹tnego
		System.out.println("Pole ko³a " + six.liczeniePola()); // warunki kompletne
		System.out.println("Obwód ko³a " + six.liczenieObwodu()); // warunki kompletne
	} // dopisaæ formu³y, dziêki którym pola i obwody nie wyœwietla³yby siê jeœli figura bêdzie niepoprawna
}
