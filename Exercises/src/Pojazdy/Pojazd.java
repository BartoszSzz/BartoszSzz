package Pojazdy;

import java.util.Date;

public class Pojazd {
	String marka;
	int rokProdukcji;
	Date ostatniSerwis;
	
	public Pojazd(String marka, int rokProdukcji, Date ostatniSerwis) { // to jest konstruktor
		this.marka = marka;
		this.rokProdukcji = rokProdukcji;
		this.ostatniSerwis = ostatniSerwis;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public int getRokProdukcji() {
		return rokProdukcji;
	}
	
	public void setOstatniSerwis (Date ostatniSerwis) { // w metodzie set musi by� przekazany parametr kt�ry chcemy ustawi�
		this.ostatniSerwis = ostatniSerwis;
	}
	
	public Date getOstatniSerwis() {
		return ostatniSerwis;
	}
}
