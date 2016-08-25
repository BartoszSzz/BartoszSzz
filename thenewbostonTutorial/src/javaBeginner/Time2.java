package javaBeginner;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	public Time2(int h) {
		hour = h;
		minute = 0;
		second = 0;
	}
	public Time2(int h, int m) {
		hour = h;
		minute = m;
		second = 0;
	}
	public Time2(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		hour = ((h>=0&&h<24) ? h:0);
	}
	public void setMinute(int m) {
		minute = ((m>=0&&m<60) ? m:0);
	}
	public void setSecond(int s) {
		second = ((s>=0&&s<24) ? s:0);
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
