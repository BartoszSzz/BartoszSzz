
public class IF {
	public static void main(String[] args) {
	System.out.println(checkIfAdult(1987));
	System.out.println(checkIfAdult(2015));
	System.out.println(checkIfAdult(1998));
	System.out.println(checkIfNegativeNumber(2));
	System.out.println(checkIfNegativeNumber(-2));
	
	}
	public static boolean checkIfAdult(int dateToCheck) {
		boolean isAdult = true;
		
		if(2016 - dateToCheck < 18) {
			isAdult = false;
		}
		
		return isAdult;
	}

	public static boolean checkIfNegativeNumber(int numberToCheck) {
		boolean isNegative = false;
		
		if(numberToCheck < 0) {
			isNegative = true;
		}
		
		return isNegative;
	}
}