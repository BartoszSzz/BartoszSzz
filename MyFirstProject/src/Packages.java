// paczki s�u�� do porz�dkowania klas

// je�li w tymi miejscu wpiszemy 'package tutorials;' to eclipse przeniesie klas� 'Packages' do paczki 'tutorials'

// import klas z innych paczek. Nazwy paczek to: javax oraz tutorials.basic
import javax.swing.JLabel;

import tutorials.basic.Person;

public class Packages {
	public static void main(String[] args) {
		/*miejsce 1*/Person person = new /*miejsce 2*/ Person(""); // je�li w miejscu 1 i 2 znajdzie si� nazwa paczki (z kropk�), a polecenie 'import' zostanie skasowane, to klasa 'Packages' odwo�a si� do tej paczki i metody wy��cznie w tym miejscu
		
		JLabel lbl;
	}
}
