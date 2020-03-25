package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Tube extends RadialGeometry {

	private Ray _axisRay;
	
	/**
	 * constructor - uses parent constr for radius
	 * @param _radius
	 * @param ax
	 */
	
	public Tube(double _radius, Ray ax) {
		super(_radius);
		_axisRay = new Ray(ax.getPoint(), ax.getDirection());
		// TODO Auto-generated constructor stub
	}

	public Ray get_axisRay() {
		return _axisRay;
	}

	/**
	 * to string
	 * @return
	 */	
	@Override
	public String toString() {
		return super.toString()+" axisRay=" + _axisRay;
	}

	@Override
	public Vector getNormal(Point3D p) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
