package FiguryGeometryczne;

public class Prostokat extends Czworobok {
	public Prostokat(long bokA, long bokB) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokA;
		this.bokD = bokB;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
		if (daneOK == false || figuraOK == false) {
			System.out.println("Figura (prostok¹t) NIEPOPRAWNA !!!");
		}
	}

	@Override
	public long liczeniePola() {
		long pole = bokA * bokB;
		return pole;
	}

	@Override
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC + bokD;
		return obwod;
	}

	@Override // nadpisywanie (rzadziej u¿ywane: przeci¹¿anie) motody
	protected boolean czyDaneWejsciowePoprawne() {
		// liczby muszê byæ wiêksze od 0
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || bokD<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}

	@Override
	protected boolean czyDaSieZbudowacFigure() {
		return true;
	}
}
