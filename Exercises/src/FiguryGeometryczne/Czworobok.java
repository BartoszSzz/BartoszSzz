package FiguryGeometryczne;

//idea abstracji = jako abstrakcj� uznaje si� t� rzecz, kt�r� na tym poziomie nie da si� zdefiniowa�
public abstract class Czworobok {
	protected long bokA; // musi by� protected a nie private, �eby klasy, kt�re dziedzicz� widzia�y te pola
	protected long bokB;
	protected long bokC;
	protected long bokD;
	
	public void setBokA(long bokA) {
		this.bokA = bokA;
	}
	
	public void setBokB(long bokB) {
		this.bokB = bokB;
	}
	
	public void setBokC(long bokC) {
		this.bokC = bokC;
	}
	
	public void setBokD(long bokD) {
		this.bokD = bokD;
	}
	
	public long getBokA() {
		return bokA;
	}
	
	public long getBokB() {
		return bokB;
	}
	
	public long getBokC() {
		return bokC;
	}
	
	public long getBokD() {
		return bokD;
	}
	
	// je�li cho� jedna metoda jest abstrakcyjna, to klasa te� musi by� abstrakcjna
	public abstract long liczeniePola(); 
	
	public abstract long liczenieObwodu();
	
	protected abstract boolean czyDaneWejsciowePoprawne();
	
	protected abstract boolean czyDaSieZbudowacFigure();
}
