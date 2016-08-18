package javaBeginner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeAdvisor {
	public static void main(String[] args) {
		Scanner ageScanner = new Scanner(System.in);
		int age;
		System.out.println("Powiedz mi ile masz lat, a ja powiem Ci w jakim jesteœ okresie rozwoju cz³owieka (podaj liczbê).");
		
		try {
			age = ageScanner.nextInt();
			if(age<1) {
				System.out.println("Jesteœ w okresie niemowlêcym"); 
				} else if(age<=3) {
					System.out.println("Jesteœ w okresie poniemowlêcym.");
				} else if(age<=12) {
					System.out.println("Jesteœ w okresie dzieciñstwa.");
				} else if(age<=19) {
					System.out.println("Jesteœ w okresie dojrzewania.");
				} else if(age<=34) {
					System.out.println("Jesteœ w okresie wczesnej doros³oœci.");
				} else if(age<=49) {
					System.out.println("Jesteœ w okresie œredniej doros³oœci.");
				} else if(age<=64) {
					System.out.println("Jesteœ w okresie póznej dros³oœci.");
				} else if(age<=74) {
					System.out.println("Jesteœ w podesz³ym wieku.");
				} else if(age<=89) {
					System.out.println("Jesteœ w starczym wieku.");
				} else if(age>=90) {
					System.out.println("Jesteœ w sêdziwym wieku.");
				}
			} catch (InputMismatchException e) {
				System.out.println("B³êdny format wieku. Podaj liczbê ca³kowit¹: np. 10");
		}
	}
}
