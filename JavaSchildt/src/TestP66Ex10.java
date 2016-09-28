// program wyszukuj¹cy liczby pierwsze z przedzia³u od 2 do 100
public class TestP66Ex10 {

	public static void main(String[] args) {
		int i;
		int j;
		boolean isPrime;
		for(i=2; i<=100; i++){
			isPrime = true;
			
			for(j=2; j<=i/j; j++) {
				if((i % j) == 0) {
				isPrime = false;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}
