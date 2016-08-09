package School;

public class Employee extends Person {
	private String employeeID;
	
	public Employee(String nameToSet, String surnameToSet, String employeeIDToSet) {
		super(nameToSet, surnameToSet);
		employeeID = employeeIDToSet;
	}
}
