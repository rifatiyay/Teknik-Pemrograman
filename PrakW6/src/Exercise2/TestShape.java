package Exercise2;

public class TestShape {
	public static void main(String[] args) {
		 Shape s1 = new Shape();
		 Shape s2 = new Shape("Yellow", true);

		 System.out.println(s1.toString());
		 if(s2.isFilled()){
		 System.out.println(s2.toString());
		 }
		 s1.setColor("Dark Blue");
		 s1.setFilled(false);
		 System.out.println(s1.toString());
	}
}
