package School;

public class Person {
	private String name;
	private String surname;
	
	public Person(String nameToSet, String surnameToSet) {
		name = nameToSet;
		surname = surnameToSet;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setName(String nameToSet) {
		name = nameToSet;
	}
	
	public void setSurname(String surnameToSet) {
		surname = surnameToSet;
	}
}
