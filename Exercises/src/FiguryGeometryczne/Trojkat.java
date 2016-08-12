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
				System.out.println("Figura (tr�jk�t) NIEPOPRAWNA !!!");
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
		if (bokC>=bokA + bokB || bokC != obliczanieOdcinkaAWysokosc() + obliczanieOdcinkaBWysokosc()) {
			poprawnaFigura = false;
		}
		return poprawnaFigura;
	}
	
	private double obliczanieOdcinkaAWysokosc() {// jest do odcinek b�d�cy podstaw� tr�jk�ta prostok�tnego wyznaczonego "wewn�trz" tr�jk�ta, kt�rego jedn� przyprostok�tn� jest 'wysoko��' a drug� bokA
		double odcinekAWysokosc = (double) Math.sqrt((double) Math.pow(bokA, 2) - (double) Math.pow(wysokosc, 2));
		return odcinekAWysokosc;
	}
	
	private double obliczanieOdcinkaBWysokosc() {// jest do odcinek b�d�cy podstaw� tr�jk�ta prostok�tnego wyznaczonego "wewn�trz" tr�jk�ta, kt�rego jedn� przyprostok�tn� jest 'wysoko��' a drug� bokB
		double odcinekBWysokosc = (double) Math.sqrt((double) Math.pow(bokB, 2) - (double) Math.pow(wysokosc, 2));
		return odcinekBWysokosc;
	}
}
