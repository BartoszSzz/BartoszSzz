package javaBeginner;

public class DateToString {
	private int month;
	private int day;
	private int year;
	
	public DateToString(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this); // "this" oznacza, ¿e wyœwietlone zostan¹ zmienne okreœlone w metodzie
	}
	
	// ta metoda pozwala wyœwietliæ datê (liczby) jako ci¹g znaków (String). W cudzys³owie napisany jest format, a po przecinki zmienne, jakie maj¹ byæ wyœwietlone w tym formacie
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
