package apteka;

public class PomocApteczna extends Pracownik{

	public PomocApteczna(int ID, String name, String surname) {
		super(ID, name, surname);
		this.position = "Pomoc apteczna";
		this.salary = 1500;
	}

	@Override
	public boolean checkIfCanBeManager() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfOnTraineeship() {
		// TODO Auto-generated method stub
		return false;
	}

}
