import java.util.*;
public class InputTest2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		// get first input
		System.out.print("Siapa nama kamu?");
		String nama = in.nextLine();

		// get second input
		System.out.print("Berapa umur kamu?");
		int umur = in.nextInt();

		// display output on console
		System.out.println("Hello," +nama+ ". Tahun depan umurmu akan " +(umur+1));
	}
}