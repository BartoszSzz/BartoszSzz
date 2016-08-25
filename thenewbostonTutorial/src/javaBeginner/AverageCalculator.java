package javaBeginner;
// aplikacja liczy �redni� z dowolnej ilo�ci liczb
// mo�na j� udoskonali� wprowadzajc mo�liwo�� podania liczb przez u�ytkownika
public class AverageCalculator {
	public static void main(String[] args) {
	System.out.println(average(12,43,54,74,24));	
	}
	
	public static double average(double...number) {
		double total=0;
		for(double x:number) {
			total+=x;
		}
		return total/number.length;
	}
}
