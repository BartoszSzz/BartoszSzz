package School;
public class AdmistrationEmployee extends Employee {
	private String facoulty;
	
	public AdmistrationEmployee(String nameToSet, String surnameToSet, String employeeIDToSet, String facoultyToSet) {
		super(nameToSet, surnameToSet, employeeIDToSet);
		facoulty = facoultyToSet;
	}
	
	public String getFacoulty() {
		return facoulty;
	}
	
	public void setFacoulty(String facoulty) {
		this.facoulty = facoulty;
	}
}
