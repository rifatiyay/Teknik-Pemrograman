package Exercise2;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

		/* Override the setLength() and setWidth() to change both
		 * the width and length, so as to maintain the square
		 * geometry
		 */
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	
	@Override
	public void setLength(double side) {
		setSide(side);
	}

		/* Override the toString() method to return "A Square with
		 * side=xxx, which is a subclass of yyy", where yyy is the
		 * output of the toString() method from the superclass
		 */
	@Override
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}
}
