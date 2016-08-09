package Pojazdy;

import java.util.Date;

public class SamochodCiezarowy extends Samochod{
	int ladownosc;
	
	public SamochodCiezarowy (String marka, int rokProdukcji, Date ostatniSerwis, String nadwozie, int liczbaDrzwi, int ladownosc) {
		super(marka, rokProdukcji, ostatniSerwis, nadwozie, liczbaDrzwi);
		this.ladownosc = ladownosc;
	}
}
