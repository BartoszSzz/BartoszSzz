package javaBeginner;

import java.util.Scanner;

public class AgeAdvisor {
	public static void main(String[] args) {
		Scanner ageScanner = new Scanner(System.in);
		int age;
		System.out.println("Powiedz mi ile masz lat, a ja powiem Ci w jakim jesteœ okresie rozwoju cz³owieka.");
		age = ageScanner.nextInt();
		
		switch (age) {
		case 1: case 2: case 3:
			System.out.println("Jesteœ w okresie poniemowlêcym.");
			break;
		case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
			System.out.println("Jesteœ w okresie dzieciñstwa.");
			break;
		case 13: case 14: case 15: case 16: case 17: case 18: case 19:
			System.out.println("Jesteœ w okresie dojrzewania.");
			break;
		case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34:
			System.out.println("Jesteœ w okresie wczesnej doros³oœci.");
			break;
		case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
			System.out.println("Jesteœ w okresie œredniej doros³oœci.");
			break;
		case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64:
			System.out.println("Jesteœ w okresie póznej dros³oœci.");
			break;
		case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: 
			System.out.println("Jesteœ w podesz³ym wieku.");
			break;
		case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:	
			System.out.println("Jesteœ w starczym wieku.");
			break;
		case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
			System.out.println("Jesteœ w wieku sêdziwym.");
			break;
		default:
			System.out.println("Jesteœ za stary na ten program.");
			break;
		}
	}
}
