package apteka;

public class TechnikFarmaceutyczny extends Pracownik {
	public boolean ifOnTraineeship;
	
	public TechnikFarmaceutyczny(int ID, String name, String surname, boolean ifOnTraineeship) {
		super(ID, name, surname);
		this.ifOnTraineeship = ifOnTraineeship;
		this.position = "Technik farmaceutyczny";
		this.salary = setSalary(); // technik na sta¿u zarabia mniej ni¿ po sta¿u
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
	
	public double setSalary() {
		if (ifOnTraineeship == true) {
			return salary = 1500;
		}
		return salary = 2600;
	}
}
