package apteka;

public class Kierownik extends MgrFarmacji {

	public Kierownik(int ID, String name, String surname, int yearOfGraduation) {
		super(ID, name, surname, yearOfGraduation);
		this.position = "Kierownik";
		
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public boolean checkIfCanBeManager() {
		// TODO Auto-generated method stub
		return true;
	}

}
