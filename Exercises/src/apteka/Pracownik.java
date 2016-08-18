package apteka;

public abstract class Pracownik {
	protected int ID;
	protected String name;
	protected String surname;
	protected String position;
	protected String email;
	protected double salary;
	// dodaæ datê rozpoczêcia pracy
	// dodaæ datê zakoñczenia pracy
	
	public Pracownik(int ID, String name, String surname) {
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.email = getName().toLowerCase() + "." + getSurname().toLowerCase() + "@" + "apteka.pl";
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}	
	
	public String getPosition() {
		return position;
	}

	public abstract boolean checkIfCanBeManager();
	
	public abstract boolean checkIfOnTraineeship();
 }
