package javaBeginner;

public class TimeApp {

	public static void main(String[] args) {
		Time timeObject = new Time();
		timeObject.setTime(16,21,45);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toAmerican());
	}

}
