package apteka;

public class Dermokonsultant extends Pracownik {
	private String representedFirm;
	
	public Dermokonsultant(int ID, String name, String surname, String representedFirm) {
		super(ID, name, surname);
		this.representedFirm = representedFirm;
		this.position = "Dermokonsultant";
		this.salary = 2500;
	}
	
	public void setRepresentedFirm(String representedFirm) {
		this.representedFirm = representedFirm;
	}
	
	public String getRepresentedFirm() {
		return representedFirm;
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
