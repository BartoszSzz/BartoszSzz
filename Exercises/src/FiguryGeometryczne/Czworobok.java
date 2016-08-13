package FiguryGeometryczne;

//idea abstracji = jako abstrakcjê uznaje siê tê rzecz, któr¹ na tym poziomie nie da siê zdefiniowaæ
public abstract class Czworobok {
	protected long bokA; // musi byæ protected a nie private, ¿eby klasy, które dziedzicz¹ widzia³y te pola
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
	
	// jeœli choæ jedna metoda jest abstrakcyjna, to klasa te¿ musi byæ abstrakcjna
	public abstract long liczeniePola(); 
	
	public abstract long liczenieObwodu();
	
	protected abstract boolean czyDaneWejsciowePoprawne();
	
	protected abstract boolean czyDaSieZbudowacFigure();
}
