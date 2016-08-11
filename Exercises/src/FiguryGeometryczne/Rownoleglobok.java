package FiguryGeometryczne;

public class Rownoleglobok extends Czworobok {
	private long wysokosc;
	
	public Rownoleglobok(long bokA, long bokB, long wysokosc) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.wysokosc = wysokosc;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
		if(daneOK == false || figuraOK == false) {
			System.out.println("Figura (r�wnoleg�obok) NIEPOPRAWNA !!!");
		}
	}

	@Override
	public long liczeniePola() {
		long pole = bokA * wysokosc;
		return pole;
	}

	@Override
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC + bokD;
		return obwod;
	}
	
	public void setWysokosc(long wysokosc) {
		this.wysokosc = wysokosc;
	}

	@Override
	protected boolean czyDaneWejsciowePoprawne() {
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || bokD<=0 || wysokosc<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}
	
	// tego nie da si� sprawdzi�
	@Override
	protected boolean czyDaSieZbudowacFigure() {
		return true;
	}
}
