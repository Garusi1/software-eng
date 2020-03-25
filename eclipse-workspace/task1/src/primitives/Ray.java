package primitives;

public class Ray {
	
	private Point3D point;
	private double direction;

	
	/**
	 * constructor
	 * @param p
	 * @param direc
	 */
	public Ray(Point3D p, double direc) {
		point = new Point3D(p);
		direction = direc;
	}

/**
 * getters
 * @return
 */
	public Point3D getPoint() {
		return point;
	}


	public double getDirection() {
		return direction;
	}
	
	
	
}
