package apteka;

public class ChangeService implements IChangeService {

	@Override
	public void deleteMedicine(Medicine name) {
		name = null;
	}

	@Override
	public int checkAmountMedicine(Medicine name) {
		int amountMedicine = name.getAmountInBox() * name.getAmount();
		return amountMedicine;
	}

}
