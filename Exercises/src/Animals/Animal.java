package Animals;
// idea abstracji = jako abstrakcjê uznaje siê tê rzecz, któr¹ na tym poziomie nie da siê zdefiniowaæ
public abstract class Animal {
	protected int age; // musi byæ protected a nie private, ¿eby klasa Dog i Cat widzia³y te pola
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
	
	public abstract void giveSound(); // jeœli choæ jedna metoda jest abstrakcyjna, to klasa te¿ musi byæ abstrakcjna
}
