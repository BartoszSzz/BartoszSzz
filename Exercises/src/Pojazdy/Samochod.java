package Pojazdy;

import java.util.Date;

public class Samochod extends Dwuslad{
	int liczbaDrzwi;
	
	public Samochod (String marka, int rokProdukcji, Date ostatniSerwis, String nadwozie, int liczbaDrzwi) {
		super(marka, rokProdukcji, ostatniSerwis, nadwozie);
		this.liczbaDrzwi = liczbaDrzwi;
	}
}
