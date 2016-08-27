package javaBeginner;

public class DateToStringApp {

	public static void main(String[] args) {
		DateToString date = new DateToString(27,8,2016);
		Composition object = new Composition("Bartek", date);
		
		System.out.println(object); // wyœwietlane jest wszystko, co "zawiera siê" w metodach w klasie Composition
	}

}
