
public class GeometricProgression {
	public static void main(String[] args) {
		System.out.println(calculation(1, 4, 3));
	}
	public static int calculation(int a1, int n, int r) {
		int an = a1 * r;
		for(int i=3; i<=n; i++) { // i = 3, poniewa¿ a1 (i=1) jest znane, a a2 jest wykonywane powy¿ej
			an = an * r;
		}
		return an;
	}
}
