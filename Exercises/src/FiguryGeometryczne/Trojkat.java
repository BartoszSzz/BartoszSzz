package FiguryGeometryczne;

public class Trojkat {
	private double bokA;
	private double bokB;
	private double bokC;
	private double wysokosc;
	
	public Trojkat(double bokA, double bokB, double bokC, double wysokosc) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokC;
		this.wysokosc = wysokosc;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		
			if (daneOK == false || figuraOK == false) {
				System.out.println("Figura (trójk¹t) NIEPOPRAWNA !!!");
			}

	}
	public double liczeniePola() {
		double pole = (bokC * wysokosc)/2;
		return pole;
	}
	
	public double liczenieObwodu() {
		double obwod = bokA + bokB + bokC;
		return obwod;
	}
	
	private boolean czyDaneWejsciowePoprawne() {
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || wysokosc<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}

	private boolean czyDaSieZbudowacFigure() {
		boolean poprawnaFigura = true;
		if (bokC>=bokA + bokB || (bokC != obliczanieOdcinkaAWysokosc() + obliczanieOdcinkaBWysokosc()) && (obliczanieOdcinkaBWysokosc() != bokC + obliczanieOdcinkaAWysokosc())) {
			poprawnaFigura = false;
		}
		return poprawnaFigura;
	}
	
	private double obliczanieOdcinkaAWysokosc() {// jest do odcinek bêd¹cy podstaw¹ trójk¹ta prostok¹tnego wyznaczonego "wewn¹trz" trójk¹ta ostrok¹tnego, którego jedn¹ przyprostok¹tn¹ jest 'wysokoœæ' a drug¹ bokA LUB jest do odcinek bêd¹cy podstaw¹ trójk¹ta prostok¹tnego wyznaczonego "na zewn¹trz" trójk¹ta rozwartok¹tnego, którego jedn¹ przyprostok¹tn¹ jest 'wysokoœæ' a drug¹ bokA
		double odcinekAWysokosc = (double) Math.sqrt((double) Math.pow(bokA, 2) - (double) Math.pow(wysokosc, 2));
		return odcinekAWysokosc;
	}
	
	private double obliczanieOdcinkaBWysokosc() {// jest do odcinek bêd¹cy podstaw¹ trójk¹ta prostok¹tnego wyznaczonego "wewn¹trz" trójk¹ta ostrok¹tnego, którego jedn¹ przyprostok¹tn¹ jest 'wysokoœæ' a drug¹ bokB LUB jest do odcinek bêd¹cy podstaw¹ trójk¹ta prostok¹tnego wyznaczonego "na zewn¹trz trój¹ta wy¿ej i niniejszego" trójk¹ta rozwartok¹tnego, którego jedn¹ przyprostok¹tn¹ jest 'wysokoœæ' a drug¹ bokA
		double odcinekBWysokosc = (double) Math.sqrt((double) Math.pow(bokB, 2) - (double) Math.pow(wysokosc, 2));
		return odcinekBWysokosc;
	}
}
