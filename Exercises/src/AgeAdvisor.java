

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeAdvisor {
	public static void main(String[] args) {
		Scanner ageScanner = new Scanner(System.in);
		int age;
		System.out.println("Powiedz mi ile lat sko�czy�e�, a ja powiem Ci w jakim jeste� okresie rozwoju cz�owieka (podaj liczb�).");
		
		try {
			age = ageScanner.nextInt();
			if(age<0) {
				System.out.println("Poda�e� liczb� ujemn�.");
			} else if (age==0) {
				System.out.println("W�a�nie si� urodzi�e� lub jeste� w okresie niemowl�cym");
			} else if(age<=3) {
				System.out.println("Jeste� w okresie poniemowl�cym.");
			} else if(age<=12) {
				System.out.println("Jeste� w okresie dzieci�stwa.");
			} else if(age<=19) {
				System.out.println("Jeste� w okresie dojrzewania.");
			} else if(age<=34) {
				System.out.println("Jeste� w okresie wczesnej doros�o�ci.");
			} else if(age<=49) {
				System.out.println("Jeste� w okresie �redniej doros�o�ci.");
			} else if(age<=64) {
				System.out.println("Jeste� w okresie p�znej dros�o�ci.");
			} else if(age<=74) {
				System.out.println("Jeste� w podesz�ym wieku.");
			} else if(age<=89) {
				System.out.println("Jeste� w starczym wieku.");
			} else if(age>=90) {
				System.out.println("Jeste� w s�dziwym wieku.");
			}
			} catch (InputMismatchException e) {
				System.out.println("B��dny format wieku. Podaj liczb� ca�kowit�: np. 10");
		}
	}
}
