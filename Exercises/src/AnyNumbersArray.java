
public class AnyNumbersArray {
	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int array[]={12,13,42,13,1,34};
		int sum=0;
		
		for(int counter=0; counter<array.length; counter++) {
			sum+=array[counter];
			System.out.println(counter + "\t" + array[counter]);
		}
		System.out.println("Suma tych liczb wynosi: " + sum);
	}
}
