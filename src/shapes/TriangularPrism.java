package shapes;
/**
 * Represents a TriangularPrism.
 */

import java.lang.Math; 

public class TriangularPrism extends Prism
{

	/**
	 * Creates a TriangularPrism with specified height and side.
	 * @param height the height
	 * @param side the side
	 */
	public TriangularPrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcBaseArea() {
		return (getSide() * getSide() * Math.sqrt(3)) / 4;
	}

	@Override
	public String toString() {
		return "TriangularPrism base area: " + calcBaseArea() + ", side: " + getSide() + ", volume: "
				+ calcVolume() + ", height: " + getHeight();
	}	
}
