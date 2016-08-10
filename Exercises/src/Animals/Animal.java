package Animals;
// idea abstracji = jako abstrakcj� uznaje si� t� rzecz, kt�r� na tym poziomie nie da si� zdefiniowa�
public abstract class Animal {
	protected int age; // musi by� protected a nie private, �eby klasa Dog i Cat widzia�y te pola
	protected String race;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String getRace() {
		return race;
	}
	
	public abstract void giveSound(); // je�li cho� jedna metoda jest abstrakcyjna, to klasa te� musi by� abstrakcjna
}
