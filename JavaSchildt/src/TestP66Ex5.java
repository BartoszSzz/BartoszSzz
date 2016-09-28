
public class TestP66Ex5 {
	public static void main(String args[]) {
	    int sum = 0;
	    for (int i=1; i<10; i++) {
	      // Je¿li zmienna sum by³aby zainicjowana w tym miejscu w kodzie, to suma generowana by by³a a nowo po ka¿dej pêtli (wynik sumy z poprzedniej pêtli by³by tracony), a funkcja syso nie mia³aby do niej dostêpu
	    	sum = sum + i; 
	    }
	    System.out.println("Suma wynosi: " + sum);
	  }
	}
