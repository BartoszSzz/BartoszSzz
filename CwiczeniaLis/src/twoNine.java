
public class twoNine {
	public static void main(String[] args) {
		// operator -- zmniejsza warto�� zmiennej o 1
		/*1*/ int x = 1, y; // zmienna x przyjmuje warto�� 1 (x=1)
		/*2*/ System.out.println(++x + "," + x); // zmienna x jest najpierw zwi�kszana o 1, a potem wy�wietlana (x=1+1)
		/*3*/ System.out.println(x++); // najpierw warto�c x jest wy�wietlana, a potem zwi�kszana (x=2+1)
		/*4*/ System.out.println(x); // wy�wietlanie warto�ci x (x=3)
		/*5*/ y = x++; // najpierw zmiennej y jest przypisywana dotychczasowa warto�� x (x=3, y=3), a nast�pnie warto�c x jest zwi�kszana o jeden (x=4)
		/*6*/ System.out.println(y); // wy�wietlanie warto�ci y
		/*7*/ y = ++x; // zwi�kszamy warto�� x o 1 (x=5), a nast�pnie przypisujemy t� warto�� do zmiennej y
		/*8*/ System.out.println(++y); // zwi�kszamy y o 1 (y=6) i wy�wietlamy na ekranie
	}
}
