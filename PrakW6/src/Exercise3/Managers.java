package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

interface Sortable {
	public abstract int compare(Sortable b);

	/* modified code by me from geeksforgeeks.org */
	public static void shell_sort(Sortable[] a) {
		int n = a.length;
		for (int gap = n/2; gap > 0; gap /= 2){
			for (int i = gap; i < n; i += 1){
				Sortable temp = a[i];
				int j;
				for (j = i; j >= gap && a[j - gap].compare(temp) < 0; j -= gap){
					a[j] = a[j - gap];
					a[j] = temp;
				}
			}
		}
} 

public class Managers extends Employee implements Sortable{
	private String secretaryName;

	public Managers(String name, double salary, int hireday, int hiremonth, int hireyear) {
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
