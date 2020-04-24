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

			Vector vec1 = _p.subtract(p2);
			Vector vec2 = _p.subtract(p3);
			if ((vec1.crossProduct(vec2)).dotProduct(new Vector(_p)) == 0)//.normalize() -> ??
			{ _normal = (vec1.crossProduct(vec2).normalize());} // *T*O*D*O*
			else System.out.println(" " +(vec1.crossProduct(vec2)));
			//else throw new IllegalArgumentException("The normal is False");//System.out.println((vec1.crossProduct(vec2)).dotProduct(new Vector(_p)))
	
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
		return _normal;
	}
	
}
