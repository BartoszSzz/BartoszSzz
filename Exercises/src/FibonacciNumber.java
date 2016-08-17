public class FibonacciNumber {
	public static void main(String[] args) {
		int n = 19; // miejsce w ci¹gu
		int[] arrayF = new int[n+1];
		arrayF[0] = 0; // zerowe miejsce w ci¹gu
		arrayF[1] = 1; // pierwsze miejsce w ci¹gu
		
		System.out.println("F\tValue");
		System.out.println("0\t" + arrayF[0]);
		System.out.println("1\t" + arrayF[1]);
		for(int counter = 2; counter <= n; counter++) {
			int fn = 1; 
			fn = arrayF[counter - 1] + arrayF[counter - 2];
			arrayF[counter] = fn;
			System.out.println(counter + "\t" + fn);
		}
	}
		
	
}

