package apteka;

public class Application {
	public static void main(String[] args) {
		Pracownik lubicz = new Kierownik(1, "Piotr", "Lubicz", 1987);
		Pracownik iszler = new MgrFarmacji(2, "Monika", "Iszler", 2016);
		Pracownik nowak = new MgrFarmacji(3, "Jan", "Nowak", 1978);
		Pracownik borowska = new TechnikFarmaceutyczny(4, "Katarzyna", "Borowska", false);
		Pracownik moniuszko = new TechnikFarmaceutyczny(5, "Ilona", "Moniuszko", true);
		Pracownik kowalska = new Dermokonsultant(6, "Anna", "Kowalska", "Avene");
		Pracownik morawska = new Dermokonsultant(7, "Iwona", "Morawska", "Vichy");
		Pracownik brzozowska = new PomocApteczna(8, "Ewa", "Brzozowska");
		System.out.println(lubicz.getSalary());
		System.out.println(borowska.getSalary());
		System.out.println(moniuszko.getSalary());
		System.out.println(nowak.getSalary());
		System.out.println(iszler.getEmail());
	}
}
