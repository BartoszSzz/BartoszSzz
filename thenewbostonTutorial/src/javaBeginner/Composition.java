package javaBeginner;

public class Composition {
	private String name;
	private DateToString birthday; // To jest kompozycja. Twrzona jest zmienna odwo³uj¹ca siê do innej klasy
	
	public Composition(String theName, DateToString theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
