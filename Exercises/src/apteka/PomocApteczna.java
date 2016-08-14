package apteka;

public class PomocApteczna extends Pracownik{

	public PomocApteczna(int ID, String name, String surname) {
		super(ID, name, surname);
		this.position = "Pomoc apteczna";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return position;
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
