package Pojazdy;

import java.util.Date;

public class SamochodOsobowy extends Samochod{
	int liczbaPasazerow;
	public SamochodOsobowy(String marka, int rokProdukcji, Date ostatniSerwis, String nadwozie, int liczbaDrzwi, int liczbaPasazerow) {
		super(marka, rokProdukcji, ostatniSerwis, nadwozie, liczbaDrzwi);
		this.liczbaPasazerow = liczbaPasazerow;
	}
}
