package javaBeginner;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		// poni¿sze tablice maj¹ wiêcej ni¿ jeden wiersz
		int firstarray[][] = {{8,9,10,11},{12,13,14,15}}; // ta tablica ma dwa wiersze
		int secondarray[][] = {{30,31,31,33},{43},{4,5,6}}; // ta tablica ma trzy wiersze
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
	}
	// metoda wyœwietlaj¹ca zawartoœæ wielowierszowych tablic
	public static void display(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
