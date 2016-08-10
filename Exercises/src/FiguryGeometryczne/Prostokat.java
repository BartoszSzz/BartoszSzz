package FiguryGeometryczne;

public class Prostokat extends Czworobok {
	public Prostokat(long bokA, long bokB) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokA;
		this.bokD = bokB;
	}

	@Override
	public long liczeniePola() {
		long pole = bokA * bokB;
		return pole;
	}
}
