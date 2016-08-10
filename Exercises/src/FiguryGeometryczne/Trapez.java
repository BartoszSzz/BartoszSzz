package FiguryGeometryczne;

public class Trapez extends Czworobok {
	private long wysokosc;
	
	public Trapez(long bokA, long bokB, long bokC, long bokD, long wysokosc) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokC;
		this.bokD = bokD;
		this.wysokosc = wysokosc;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
		if (daneOK == false || figuraOK == false) {
			System.out.println("Figura (trapez) NIEPOPRAWNA !!!");
		}
	}

	@Override
	public long liczeniePola() {
		long pole = (bokA + bokB) * wysokosc / 2;
		return pole;
	}

	@Override
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC + bokD;
		return obwod;
	}

	@Override
	protected boolean czyDaneWejsciowePoprawne() {
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || bokD<=0 || wysokosc<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}

	@Override
	// tego nie da siê sprawdziæ
	protected boolean czyDaSieZbudowacFigure() {
		return true;
	}
}
