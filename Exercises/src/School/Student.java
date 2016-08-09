package School;

public class Student extends Person {
	private String indexNumber;
	
	public Student(String nameToSet, String surnameToSet, String indexNumberToSet) {
		super(nameToSet, surnameToSet);
		indexNumber = indexNumberToSet;
	}
}
