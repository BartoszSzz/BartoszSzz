package overriding;

// Subclass is inheriting all variables and methods defined in Base
public class Subclass extends Base {
	public static void main(String[] args) {
		Subclass s = new Subclass();
	}
	public Subclass() {
	sayHello(); // we are calling the sayHello method defined in Base
	}
	
	public void sayHello() {
		//super.sayHello();
		
		System.out.println("Hi!");
	}
}
