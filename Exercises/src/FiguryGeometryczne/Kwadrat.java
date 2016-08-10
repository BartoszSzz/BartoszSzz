package FiguryGeometryczne;

public class Kwadrat extends Czworobok {
	public Kwadrat(long bokA){
		this.bokA = bokA;
		this.bokB = bokA;
		this.bokC = bokA;
		this.bokD = bokA;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
		if(daneOK == false || figuraOK == false) { // wykrzyknik neguje 
			System.out.println("Figura (kwadrat) NIEPOPRAWNA !!!");
		}
	}

	@Override
	public long liczeniePola() {
		long pole = bokA * bokA;
		return pole;
	}

	@Override
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC + bokD;
		return obwod;
	}

	@Override
	protected boolean czyDaneWejsciowePoprawne() {
		// trzeba sprawdzi� czy warto�ci s� wi�ksze od 0
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
