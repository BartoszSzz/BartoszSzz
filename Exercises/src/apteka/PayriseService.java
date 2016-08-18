package apteka;

public class PayriseService implements IPayriseService {

	@Override
	public void decreaseSalary(Pracownik employee, double decrease) {
			if(decrease > 0) {
			double newSalary = employee.getSalary() - decrease;
			employee.setSalary(newSalary);
		} else if (decrease == 0) {
			System.out.println("Obni¿ka równa 0. Pensja nie zostanie zmieniona.");
		} else {
			System.out.println("Dodatnia powy¿ka. Pensja nie zostanie zmieniona.");
		}		
	}

	@Override
	public void raiseSalary(Pracownik employee, double raise) {
		if (raise > 0) {
			double newSalary = employee.getSalary() + raise;
			employee.setSalary(newSalary);
		} else if (raise == 0) {
			System.out.println("Podwy¿ka równa 0. Pensja nie zostanie zmieniona.");
		} else {
			System.out.println("Ujemna podwy¿ka. Pensja nie zostanie zmieniona.");
		}
	}
}
