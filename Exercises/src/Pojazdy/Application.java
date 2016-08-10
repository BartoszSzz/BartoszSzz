package Pojazdy;

import java.util.Date;

public class Application {
	public static void main (String[] args) {
		Pojazd tola = new Pojazd("Toyota", 2005, new Date());
		tola.setOstatniSerwis(new Date());
	}
}
