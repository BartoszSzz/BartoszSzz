import javax.swing.JFrame;

public class MyWindow extends JFrame { // Klasa MyWindow dziedziczy wszystkie zmienne i metody klasy JFrame
	public static void main(String[] args) {
		new MyWindow();
	}
	
	public MyWindow() {
		setSize(500,500);
		setVisible(true);
		setTitle("My Window");
	}
}
