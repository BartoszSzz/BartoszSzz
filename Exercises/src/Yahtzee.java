import java.util.Random;
// Aplikacja, która symuluje rzucanie piêcioma kostkami, do momentu a¿ wylosowane zostanie 5 takich samych wartoœci. Jako wynik wyœwietlana jest liczba mówi¹ca ile razy komputer rzuci³ kostkami.
public class Yahtzee {
	public static void main(String[] args) {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int dice3 = rollDice();
		int dice4 = rollDice();
		int dice5 = rollDice();
		int count = 1;
		while(!(dice1==dice2 && dice2==dice3 && dice3==dice4 && dice4==dice5)){
			//we need to re-roll
			dice1=rollDice();
			dice2=rollDice();
			dice3=rollDice();
			dice4=rollDice();
			dice5=rollDice();
			count=count + 1;
		}
		System.out.println(count);
	}
	
	public static int rollDice(){
		Random oneRoll = new Random();
		int value;
		value = 1+oneRoll.nextInt(6);
		return value;
	}
}
