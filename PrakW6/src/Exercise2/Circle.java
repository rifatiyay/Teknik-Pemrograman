package Exercise2;

public class Circle extends Shape {
	
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}
	
	public Circle(double r) {
		super();
		radius = r;
	}
	
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		this.radius = r;
	}

	/* Getter and setter for the instance variable radius. */
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/* Methods getArea() and getPerimeter(). */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return radius*Math.PI*2;
	}

	/* Override the toString() method inherited, to return
	 * "A Rectangle with width=xxx and length=zzz, which is
	 * a subclass of yyy", where yyy is the output of the
	 * toString() method from the superclass.
	 */
	@Override
	public String toString() {
		return "A circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
}
