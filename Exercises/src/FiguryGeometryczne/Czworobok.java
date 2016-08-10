package FiguryGeometryczne;

public abstract class Czworobok {
	protected long bokA;
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
	
	public abstract long liczeniePola();
}
