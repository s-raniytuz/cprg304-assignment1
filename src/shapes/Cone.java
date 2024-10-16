package shapes;
/**
 * Repersents a Cone.
 */

public class Cone extends Shape {
	
	private double radius;

	/**
	 * Creates a Cone with the specified height and radius.
	 * @param height the height
	 * @param radius the radius
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * Returns the Cone's radius.
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Sets the Cone's radius
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		return  calcBaseArea() * getHeight() / 3;
	}

	@Override
	public double calcBaseArea() {
		return  Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Cone radius" + getRadius() + ", volume: " + calcVolume() + ", base area: "
				+ calcBaseArea() + ", height: " + getHeight();
	}
}