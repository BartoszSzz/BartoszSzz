package javaBeginner;

public class DateToString {
	private int month;
	private int day;
	private int year;
	
	public DateToString(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this); // "this" oznacza, �e wy�wietlone zostan� zmienne okre�lone w metodzie
	}
	
	// ta metoda pozwala wy�wietli� dat� (liczby) jako ci�g znak�w (String). W cudzys�owie napisany jest format, a po przecinki zmienne, jakie maj� by� wy�wietlone w tym formacie
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
