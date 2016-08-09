package Pojazdy;

import java.util.Date;

public class Motor extends Jednoslad {
	String owiewka;
	
	public Motor (String marka, int rokProdukcji, Date ostatniSerwis, String pozycjaZaKierownica, String owiewka) {
		super (marka, rokProdukcji, ostatniSerwis, pozycjaZaKierownica);
		this.owiewka = owiewka;
	}
}
