package apteka;

public abstract class Pracownik {
	protected int ID;
	protected String name;
	protected String surname;
	protected String position;
	protected String email;
	// dodaæ datê rozpoczêcia pracy
	// dodaæ datê zakoñczenia pracy
	
	public Pracownik(int ID, String name, String surname) {
		this.ID = ID;
		this.name = name;
		this.surname = surname;
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
	
	public String setEmail() {
		this.email = getName() + "." + getSurname() + "@" + "apteka.pl";
		return email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public abstract String getPosition();
	
	public abstract boolean checkIfCanBeManager();
	
	public abstract boolean checkIfOnTraineeship();
	
 }
