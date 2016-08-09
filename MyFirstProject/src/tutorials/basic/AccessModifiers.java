package tutorials.basic;

public class AccessModifiers {
	
	// private is the most restrictive 
	// default
	// protected
	// public
	// przy zmiennych u¿ywane s¹ te same modyfikatory
	// metody i zmienne powinny byæ jak najbardziej prywatne
	
	public static void main(String[] args) {
		
	}
	// public visibility means that this method can be accessed anywhere in the program (in any class) 
	// so long as you have an instance of this class to call it from
	public void doSomethingPublic() {
		
	}
	
	// private visibility means that this method can't be accessed anywhere other than inside of this class
	private void doSomethingPrivate() {
		
	}
	
	// protected visibility means that this method can only be accessed inside of this package
	// and from subclasses of this class
	protected void doSomethingProtected() {
		
	}
	
	// default visibility means that this method can only be accessed inside of this package
	void doSomething () { // default void
		
	}
}
