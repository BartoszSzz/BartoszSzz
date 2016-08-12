package FiguryGeometryczne;

public class Trapez extends Czworobok {
	private long wysokosc;
	
	public Trapez(long bokA, long bokB, long bokC, long bokD, long wysokosc) {
		this.bokA = bokA;
		this.bokB = bokB;
		this.bokC = bokC;
		this.bokD = bokD;
		this.wysokosc = wysokosc;
		boolean daneOK = czyDaneWejsciowePoprawne();
		boolean figuraOK = czyDaSieZbudowacFigure();
		if (daneOK == false || figuraOK == false) {
			System.out.println("Figura (trapez) NIEPOPRAWNA !!!");
		}
	}

	@Override
	public long liczeniePola() {
		long pole = (bokA + bokB) * wysokosc / 2;
		return pole;
	}

	@Override
	public long liczenieObwodu() {
		long obwod = bokA + bokB + bokC + bokD;
		return obwod;
	}

	@Override
	protected boolean czyDaneWejsciowePoprawne() {
		boolean poprawneDane = true;
		if (bokA<=0 || bokB<=0 || bokC<=0 || bokD<=0 || wysokosc<=0) {
			poprawneDane = false;
		}
		return poprawneDane;
	}
	
	private long obliczanieOdcinkaCWysokosc() { // jest do odcinek b�d�cy podstaw� tr�jk�ta prostok�tnego wyznaczonego "wewn�trz" trapezu, kt�rego jedn� przyprostok�tn� jest 'wysoko��' a drug� bokC
		long odcinekCWysokosc = (long) Math.sqrt((long) Math.pow(bokC, 2) - (long) Math.pow(wysokosc, 2));
		return odcinekCWysokosc;
	}
	
	private long obliczanieOdcinkaDWysokosc() { // jest do odcinek b�d�cy podstaw� tr�jk�ta prostok�tnego wyznaczonego "wewn�trz" trapezu, kt�rego jedn� przyprostok�tn� jest 'wysoko��' a drug� bokD
		long odcinekDWysokosc = (long) Math.sqrt((long) Math.pow(bokD, 2) - (long) Math.pow(wysokosc, 2));
		return odcinekDWysokosc;
	}
	
	@Override
	protected boolean czyDaSieZbudowacFigure() {
		boolean poprawnaFigura = true;
		if (bokB != bokA + obliczanieOdcinkaCWysokosc() + obliczanieOdcinkaDWysokosc()) {
			poprawnaFigura = false;
		}
		return poprawnaFigura;
	}
}
