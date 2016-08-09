package School;

public class Teacher extends Employee {
	private String course;
	
	public Teacher(String nameToSet, String surnameToSet, String employeeIDToSet, String courseToSet) {
		super(nameToSet, surnameToSet, employeeIDToSet);
		course = courseToSet;
	}
	
	public String getCourse () {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
}
