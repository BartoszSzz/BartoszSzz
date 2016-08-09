package tutorials.basic;

public class Constants {
	
	// nazwa sta�ej musi by� pisana wielkimi literami, a spacj� zast�puje podkre�lnik
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static void main(String[] args) {
		
		// constants never change once a value is assigned
		// usually static
		// by convention, constants are upper case
		// declare constants by using the "final" modifier
		// constants can be public because there's no harm in accessing variables directly if you can't alter it
		
		System.out.println(Constants.WIDTH);
		System.out.println(Math.PI);
	}
}
