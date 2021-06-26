package case3;

public class MathUtils {
	
	public static int factorial(int n)throws IllegalArgumentException{
		
		if (n<0){
			throw new IllegalArgumentException("Please input a positive value");
		}
		if (n>16){
			throw new IllegalArgumentException("Arithmetic overflow");
		}
		
		int fac = 1;
		for (int i=n; i>0; i--)
		fac *= i;
		return fac;
	}
}
