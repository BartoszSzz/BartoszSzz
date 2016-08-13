
public class twoNine {
	public static void main(String[] args) {
		// operator -- zmniejsza wartoœæ zmiennej o 1
		/*1*/ int x = 1, y; // zmienna x przyjmuje wartoœæ 1 (x=1)
		/*2*/ System.out.println(++x + "," + x); // zmienna x jest najpierw zwiêkszana o 1, a potem wyœwietlana (x=1+1)
		/*3*/ System.out.println(x++); // najpierw wartoœc x jest wyœwietlana, a potem zwiêkszana (x=2+1)
		/*4*/ System.out.println(x); // wyœwietlanie wartoœci x (x=3)
		/*5*/ y = x++; // najpierw zmiennej y jest przypisywana dotychczasowa wartoœæ x (x=3, y=3), a nastêpnie wartoœc x jest zwiêkszana o jeden (x=4)
		/*6*/ System.out.println(y); // wyœwietlanie wartoœci y
		/*7*/ y = ++x; // zwiêkszamy wartoœæ x o 1 (x=5), a nastêpnie przypisujemy tê wartoœæ do zmiennej y
		/*8*/ System.out.println(++y); // zwiêkszamy y o 1 (y=6) i wyœwietlamy na ekranie
	}
}
