package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane implements Geometry {
	
	private Point3D _p;
	private Vector _normal;
	
	/**
	 * 3 points const - will be updated in the next task  as requested
	 */
	public Plane(Point3D p1, Point3D p2,Point3D p3) {
		_p = new Point3D(p1);
		_normal = null;
	}
	
	/**
	 * point and normal vector constructor 
	 */
	public Plane(Point3D p1, Vector v1) {
		_p = new Point3D(p1);
		_normal = new Vector(v1);
	}
	
	
	
		
	/**
	 * to string
	 * @return
	 */

	@Override
	public String toString() {
		return "p=" + _p + ", _normal=" + _normal ;
	}
	/**
	 *   will be updated in the next task 
	 */
	public Vector getNormal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector getNormal(Point3D p) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
