import java.awt.Point;

class NamedPoint extends Point {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;

	NamedPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	public static void main(String[] arguments) { 
		NamedPoint np = new NamedPoint(19, 23, "SmallPoint");
		System.out.println("x is " + np.x);
		System.out.println("y is " + np.y);
		System.out.println("Name is " + np.name);

	}
}