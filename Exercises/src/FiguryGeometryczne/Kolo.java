package FiguryGeometryczne;

public class Kolo {
	private double r;
	public Kolo(double r) {
		this.r = r;
		boolean daneOK = czyDaneWejsciowePoprawne();
			if (daneOK == false) {
			System.out.println("Figura (ko³o) NIEPOPRAWNA !!!");
			}
	}
	
	private boolean czyDaneWejsciowePoprawne() {
		boolean danePoprawne = true;
		if (r <= 0) {
			danePoprawne = false;
		}
		return danePoprawne;
	}
	
	public double liczeniePola() {
		double pole = Math.PI * (double) Math.pow(r, 2);
		return pole;
	}
	
	public double liczenieObwodu() {
		double obwod = 2 * Math.PI * r;
		return obwod;
	}
}
