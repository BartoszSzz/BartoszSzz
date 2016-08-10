package Pojazdy;

import java.util.Date;

public class Dwuslad extends Pojazd {
	String nadwozie;
	public Dwuslad(String marka, int rokProdukcji, Date ostatniSerwis, String nadwozie) {
		super(marka, rokProdukcji, ostatniSerwis);
		this.nadwozie = nadwozie;
	}
	public void setNadwozie(String nadwozie) {
		this.nadwozie = nadwozie;
	}
	
	public String getNadwozie() {
		return nadwozie;
	}
}
