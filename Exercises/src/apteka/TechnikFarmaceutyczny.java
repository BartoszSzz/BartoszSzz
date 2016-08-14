package apteka;

public class TechnikFarmaceutyczny extends Pracownik {
	public boolean ifOnTraineeship;
	
	public TechnikFarmaceutyczny(int ID, String name, String surname, boolean ifOnTraineeship) {
		super(ID, name, surname);
		this.ifOnTraineeship = ifOnTraineeship;
		this.position = "Technik farmaceutyczny";
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
	
	public boolean checkIfOnTraineeship() {
		ifOnTraineeship = true;
		if (ifOnTraineeship = false) {
			return false;
		}
		return ifOnTraineeship;
	}

}
