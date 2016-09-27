
public class exP39 {

	public static void main(String[] args) {
		double liter;
		for (int gallon=1; gallon<=100; gallon++) {
			liter = gallon * 3.7854;
			System.out.println(gallon + "\t" + liter);
			if (gallon%10 == 0) {
				System.out.println();
			}
		}
	}

}
