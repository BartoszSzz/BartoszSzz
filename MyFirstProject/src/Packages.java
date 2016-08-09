// paczki s³u¿¹ do porz¹dkowania klas

// jeœli w tymi miejscu wpiszemy 'package tutorials;' to eclipse przeniesie klasê 'Packages' do paczki 'tutorials'

// import klas z innych paczek. Nazwy paczek to: javax oraz tutorials.basic
import javax.swing.JLabel;

import tutorials.basic.Person;

public class Packages {
	public static void main(String[] args) {
		/*miejsce 1*/Person person = new /*miejsce 2*/ Person(""); // jeœli w miejscu 1 i 2 znajdzie siê nazwa paczki (z kropk¹), a polecenie 'import' zostanie skasowane, to klasa 'Packages' odwo³a siê do tej paczki i metody wy³¹cznie w tym miejscu
		
		JLabel lbl;
	}
}
