package geometries;

public abstract class RadialGeometry implements Geometry {

	
	public double _radius;

	public RadialGeometry(double _radius) { // constructor 
		this._radius = _radius;
	}
	
	public RadialGeometry(RadialGeometry r) { //copy constructor
		this._radius = r._radius;
	}
	
	public double get_radius() {// get func
		return _radius;
	}

}
