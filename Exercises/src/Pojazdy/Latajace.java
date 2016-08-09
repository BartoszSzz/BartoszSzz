package Pojazdy;

import java.util.Date;

public class Latajace extends Pojazd {
	String typSkrzydel;
	public Latajace (String marka, int rokProdukcji, Date ostatniSerwis, String typSkrzydel) {
		super (marka, rokProdukcji, ostatniSerwis);
		this.typSkrzydel = typSkrzydel;
	}
	public String getTypSkrzydel() {
		return typSkrzydel;
	}
}
