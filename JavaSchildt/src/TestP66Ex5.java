
public class TestP66Ex5 {
	public static void main(String args[]) {
	    int sum = 0;
	    for (int i=1; i<10; i++) {
	      // Je�li zmienna sum by�aby zainicjowana w tym miejscu w kodzie, to suma generowana by by�a a nowo po ka�dej p�tli (wynik sumy z poprzedniej p�tli by�by tracony), a funkcja syso nie mia�aby do niej dost�pu
	    	sum = sum + i; 
	    }
	    System.out.println("Suma wynosi: " + sum);
	  }
	}
