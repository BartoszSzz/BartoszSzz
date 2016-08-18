package apteka;

public class Medicine extends Store {
	protected String nameOfMedicine;
	protected int dose; // w miligramach
	protected int amountInBox; // np. 30 (tabletek, ml)
	protected String type; // np. tubka, tabletki, czopki itd.
	
	public Medicine(String nameOfMedicine, int dose, int amountInBox, String type) {
		this.nameOfMedicine = nameOfMedicine;
		this.dose = dose;
		this.amountInBox = amountInBox;
		this.type = type;	
	}

	public String getNameOfMedicine() {
		return nameOfMedicine;
	}

	public void setNameOfMedicine(String nameOfMedicine) {
		this.nameOfMedicine = nameOfMedicine;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public int getAmountInBox() {
		return amountInBox;
	}

	public void setAmountInBox(int amountInBox) {
		this.amountInBox = amountInBox;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
