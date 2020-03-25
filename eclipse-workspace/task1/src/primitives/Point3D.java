package primitives;

//import com.sun.org.apache.bcel.internal.Const;

public class Point3D {

	
	private double x,y,z; 

	/**
	 * getters
	 * @return
	 */
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	/**
	 * constructors
	 * @param _x
	 * @param _y
	 * @param _z
	 */
	
	public Point3D(Coordinate _x, Coordinate _y, Coordinate _z) { //constructor by coordinate
		x=_x._coord;
		y=_y._coord;
		z=_z._coord;
	}
	
	public Point3D(double _x,double _y,double _z) {  //constructor by numbers (double)
		x=_x;
		y=_y;
		z=_z;
	}
	
	// copy constructor
	public Point3D(Point3D p) { 			//copy constructor - by another point
		x=p.x;
		y=p.y;
		z=p.z;
	}
	
	/**
	 * zero point or "reshit ha zirim" as requested
	 */
	
	public static final Point3D ZERO = new Point3D(0,0,0);
	
	
/**
 * 
 * @param point
 * @return new vector with substruct between the points and the direction of the vector
 */
	public Vector subtract(Point3D p) {
		//double si = Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y)+(p.z-this.z)*(p.z-this.z));
		double x1 = p.x-x;
		double y1 = p.y-y;
		double z1 = p.z - z;
		Point3D p1 = new Point3D(x1,y1,z1);
		double an = north_angle(p1);
		
		return new Vector(p1);
	}
	/**
	 * 
	 * @param v1
	 * @return this point plus v1 point
	 */
	
	public Point3D add(Vector v1) {
		double xx=x+v1.getX();
		double yy = y+v1.getY();
		double zz = z+v1.getZ();
		
		return new Point3D(xx, yy, zz);
	}
	
	/** return the (planer angle of the vector between this --> p, in DEGREES, in a
	 * compass order: north 0, east 90, south 180, west 270.
	 * @param p is the end point of the vector (z value is ignored). 
	 * @return angle in compass styye [0,360).
	 */
	public double north_angle(Point3D p) {
		double ans = 0;
		double a_rad = Math.atan2((p.y-y), (p.x-x));
		double a_deg = Math.toDegrees(a_rad);
		if(a_deg<=90) ans = 90-a_deg;
		else ans = 450-a_deg;
		return ans;
	}
	
	/**
	 * 
	 * @param p2
	 * @return distance Squared
	 */
	
	public double distanceSquared(Point3D p2) {
		return ((x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y)+(z-p2.z)*(z-p2.z));
	}

	/**
	 * 
	 * @param p2
	 * @return distance
	 */
	public double distance(Point3D p2) {

		return(Math.sqrt(distanceSquared(p2)));	
		
}
	/**
	 * 
	 * @return is equals Zero
	 */
	
	public boolean equalsZero() {
		if(x==ZERO.x&&ZERO.y==y&&z==ZERO.z) return true;
		return false;
	}
	/**
	 * to string function
	 */
	public String toString() {
  	  return ("x: "+x
  			  +"y: "+y
  			  +"z: " +z);
    }

	}
