package javaBeginner;

public class TimeApp2 {

	public static void main(String[] args) {
		Time2 timeObject1 = new Time2();
		Time2 timeObject2 = new Time2(5);
		Time2 timeObject3 = new Time2(5,13);
		Time2 timeObject4 = new Time2(5,13,43);
		
		System.out.printf("%s\n", timeObject1.toMilitary());
		System.out.printf("%s\n", timeObject2.toMilitary());
		System.out.printf("%s\n", timeObject3.toMilitary());
		System.out.printf("%s\n", timeObject4.toMilitary());
	}

}
