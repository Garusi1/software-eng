package geometries;


import primitives.Point3D;
import primitives.Vector;

public class Sphere extends RadialGeometry {
	
	private Point3D _center;
	
	/**
	 * constructor - uses the parent one for the radius and saves the center
	 * @param _radius
	 * @param p
	 */
	
	public Sphere(double _radius, Point3D p) {
		super(_radius);
		_center = new Point3D(p);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * getters
	 * @return
	 */
	public Point3D getCenter() {
		return _center;
	}

	public double getRadius() {
		return super._radius;
	}

	/**
	 * to string
	 * @return
	 */
	@Override
	public String toString() {
		return super.toString()+ " center=" + _center + "]";
	}
	@Override
	public Vector getNormal(Point3D p) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
