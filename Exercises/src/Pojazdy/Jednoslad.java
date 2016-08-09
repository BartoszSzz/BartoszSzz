package Pojazdy;

import java.util.Date;

public class Jednoslad extends Pojazd {
	String pozycjaZaKierownica;
	public Jednoslad(String marka, int rokProdukcji, Date ostatniSerwis, String pozycjaZaKierownica) {
		super (marka, rokProdukcji, ostatniSerwis);
		this.pozycjaZaKierownica = pozycjaZaKierownica;
	}
	public String getPozycjaZaKierownic¹ () {
		return pozycjaZaKierownica;
	}
}
