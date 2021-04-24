package Exercise2;

public class Rectangle {
	
	private double width;
	private double length;

	/* Three constructors as shown. The no-arg constructor 
	 * initializes the width and length to 1.0.
	 */
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	/* Getter and setter for all the instance variables. */
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	} 
	
	public void setLength(double length) {
		this.length = length;
	}

	/* Methods getArea() and getPerimeter(). */
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return (width*2)+(length*2);
	}

	/* Override the toString() method inherited, to return
	 * "A Rectangle with width=xxx and length=zzz, which is
	 * a subclass of yyy", where yyy is the output of the
	 * toString() method from the superclass.
	 */
	@Override
	public String toString() {
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
}
