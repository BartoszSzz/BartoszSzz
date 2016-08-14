package apteka;

public class MgrFarmacji extends Pracownik {
	private int yearOfGraduation;
	
	public MgrFarmacji(int ID, String name, String surname, int yearOfGraduation) {
		super(ID, name, surname);
		this.yearOfGraduation = yearOfGraduation;
		this.position = "Magister farmacji";
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return position;
	}
	
	public boolean checkIfCanBeManager() {
		boolean ifCanBeManager = false;
		if(2016 - yearOfGraduation >= 5) { // rok powinien byæ pobierany automatycznie
			ifCanBeManager = true;
		}
		return ifCanBeManager;
	}

	@Override
	public boolean checkIfOnTraineeship() {
		// TODO Auto-generated method stub
		return false;
	}
}
