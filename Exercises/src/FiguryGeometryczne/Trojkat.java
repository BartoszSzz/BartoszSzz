package FiguryGeometryczne;

public class Trojkat {
	private long bokA;
	private long bokB;
	private long bokC;
	private long wysokosc;
	
	public Trojkat(long bokA, long bokB, long bokC, long wysokosc) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokC;
		this.wysokosc = wysokosc;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
			if (daneOK == false || figuraOK == false) {
				System.out.println("Figura (trójk¹t) NIEPOPRAWNA !!!");
			}

	}
	public long liczeniePola() {
		long pole = (bokC * wysokosc)/2;
		return pole;
	}
	
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC;
		return obwod;
	}
	
	private boolean czyDaneWejsciowePoprawne() {
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || wysokosc<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}
// wysokosci nie da siê sprawdziæ!	
	private boolean czyDaSieZbudowacFigure() {
		boolean poprawnaFigura = true;
		if (bokC>=bokA + bokB) {
			poprawnaFigura = false;
		}
		return poprawnaFigura;
	}
}
