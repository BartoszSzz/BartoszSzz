package FiguryGeometryczne;

public class Kwadrat extends Czworobok {
	public Kwadrat(long bokA){
		this.bokA = bokA;
		this.bokB = bokA;
		this.bokC = bokA;
		this.bokD = bokA;
	}

	@Override
	public long liczeniePola() {
		long pole = bokA * bokA;
		return pole;
	}
}
