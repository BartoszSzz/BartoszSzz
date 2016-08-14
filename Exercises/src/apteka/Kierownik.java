package apteka;

public class Kierownik extends MgrFarmacji {

	public Kierownik(int ID, String name, String surname, int yearOfGraduation) {
		super(ID, name, surname, yearOfGraduation);
		this.position = "Kierownik";
		this.salary = 5000;
		
	}

	@Override
	public boolean checkIfCanBeManager() {
		// TODO Auto-generated method stub
		return true;
	}

}
