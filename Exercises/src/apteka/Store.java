package apteka;

public abstract class Store {
	protected int amount;
	
	public void setAmount(int amount) {
		this.amount = amount;		
	}

	public int getAmount() {
		return amount;
	}

}
