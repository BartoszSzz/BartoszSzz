
public class SimpleAgeAdvisor {
	public static void main(String[] args) {
		int age = 6;
		if(age <= 30) {
			System.out.println("Jeste� m�ody");
		}
		else if(age > 30 && age <= 60) {
			System.out.println("Jeste� w �rednim wieku");
		}
		else { // nawiasy klamrowe mog� by� pomini�te
			System.out.println("Jeste� stary");
		}
	// instrukcja sprawdzaj�ca warunek (znajduje si� przed znakiem zapytania) i wy�wietlaj�ca napis. Przed znakiem dwukropka znajduje si� napis, kt�ry zostanie wy�wietlony je�li warunek jest spe�niony, a po dwukropku je�li nie jest spe�niony
	System.out.println(age <= 7 ? "Mo�esz si� bawi� ile chcesz!" : "Mo�esz si� bawi� je�li masz na to czas...");
	}
}
