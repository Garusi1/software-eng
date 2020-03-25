package geometries;

import primitives.Point3D;

public class Triangle extends  Polygon{
	
	/**
	 * 3 points constructor using the parent constractor
	 */
	private Triangle(Point3D p1 ,Point3D p2, Point3D p3) {
		super(p1,p2,p3);
	}
	
	
	/**
	 * same to string function as the parent class
	 */
	public String tosString() {
		return(super.toString());
	}
	
	
}
