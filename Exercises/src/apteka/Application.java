package apteka;

public class Application {
	public static void main(String[] args) {
		Pracownik lubicz = new Kierownik(1, "Piotr", "Lubicz", 1987);
		lubicz.setEmail();
		Pracownik iszler = new MgrFarmacji(2, "Monika", "Iszler", 2016);
		iszler.setEmail();
		Pracownik nowak = new MgrFarmacji(3, "Jan", "Nowak", 1978);
		nowak.setEmail();
		Pracownik borowska = new TechnikFarmaceutyczny(4, "Katarzyna", "Borowska", false);
		borowska.setEmail();
		Pracownik moniuszko = new TechnikFarmaceutyczny(5, "Ilona", "Moniuszko", true);
		moniuszko.setEmail();
		Pracownik kowalska = new Dermokonsultant(6, "Anna", "Kowalska", "Avene");
		kowalska.setEmail();
		Pracownik morawska = new Dermokonsultant(7, "Iwona", "Morawska", "Vichy");
		morawska.setEmail();
		Pracownik brzozowska = new PomocApteczna(8, "Ewa", "Brzozowska");
		brzozowska.setEmail();
		
	}
}
