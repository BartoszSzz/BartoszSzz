
public class SimpleAgeAdvisor {
	public static void main(String[] args) {
		int age = 6;
		if(age <= 30) {
			System.out.println("Jesteœ m³ody");
		}
		else if(age > 30 && age <= 60) {
			System.out.println("Jesteœ w œrednim wieku");
		}
		else { // nawiasy klamrowe mog¹ byæ pominiête
			System.out.println("Jesteœ stary");
		}
	// instrukcja sprawdzaj¹ca warunek (znajduje siê przed znakiem zapytania) i wyœwietlaj¹ca napis. Przed znakiem dwukropka znajduje siê napis, który zostanie wyœwietlony jeœli warunek jest spe³niony, a po dwukropku jeœli nie jest spe³niony
	System.out.println(age <= 7 ? "Mo¿esz siê bawiæ ile chcesz!" : "Mo¿esz siê bawiæ jeœli masz na to czas...");
	}
}
