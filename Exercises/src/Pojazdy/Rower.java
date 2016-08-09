package Pojazdy;

import java.util.Date;

public class Rower extends Jednoslad {
	String rodzajRamy;
	
	public Rower (String marka, int rokProdukcji, Date ostatniSerwis, String pozycjaZaKierownica, String rodzajRamy) {
		super (marka, rokProdukcji, ostatniSerwis, pozycjaZaKierownica);
		this.rodzajRamy = rodzajRamy;
	}
}
