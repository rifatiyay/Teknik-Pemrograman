package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee{
	private String secretaryName;

	public Manager(String name, double salary, int hireday, int hiremonth, int hireyear) {
		super(name, salary, hireday, hiremonth, hireyear);
		secretaryName = "";
	}

	public void raiseSalary(double byPercent) {
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName() {
		return secretaryName;
	}
}
