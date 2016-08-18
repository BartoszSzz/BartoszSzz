package apteka;

public class StoreApp {
	public static void main(String[] args) {
		Medicine duomox1 = new Medicine("Duomox", 1000, 10, "tabletka");
		duomox1.setAmount(5);
		Medicine augmentin375 = new Medicine("Augmentin", 375, 21, "tabletka");
		augmentin375.setAmount(10);
		
		System.out.println(duomox1.getDose());
		
		ChangeService cs = new ChangeService(); // to polecenie tworzy obiekt który pozwala skorzystaæ z serwisu
		cs.deleteMedicine(duomox1); // prefiks cs to wskazanie serwisu
		System.out.println(cs.checkAmountMedicine(augmentin375));
	}
}
