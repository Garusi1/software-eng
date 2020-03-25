package primitives;

public class Vector {

	private double size; // I added it because it seems basic to me
	private double angel; // I added it because it seems basic to me - i didn't have time to finish the auto calc inside the contructors
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

	
//	public Vector(double p, double angel) {
//		this.size = p;
//		this.angel = angel;
//	}
	/**
	 * contstructors
	 * @param x1
	 * @param y1
	 * @param z1
	 */
	public Vector(double x1, double y1, double z1) {
		if(x1==0&&y1==0&&z1==0) throw new IllegalArgumentException("you can't add 0!!"); // in case of zero vector the progrem will throw IllegalArgumentException
 		this.x = x1;
		this.y = y1;
		this.z = z1;
		size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));

	}

	public Vector(double size, double angel, double x, double y, double z) {
		if(x==0&&y==0&&z==0) throw new IllegalArgumentException("you can't add 0!!");// in case of zero vector the progrem will throw IllegalArgumentException

		this.size = size;
		this.angel = angel;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector(Point3D p) {
		if(x==0&&y==0&&z==0) throw new IllegalArgumentException("you can't add 0!!");// in case of zero vector the progrem will throw IllegalArgumentException

		x = 33;
		y = p.getX();
		z=p.getY();
		x=p.getX();
		size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));
		
	}
	public Vector(Vector v) {
		if(x==0&&y==0&&z==0) throw new IllegalArgumentException("you can't add 0!!"); // in case of zero vector the progrem will throw IllegalArgumentException

		x=v.getX();
		y=v.getY();
		z=v.getZ();
		size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));

	}
	/**
	 * 
	 * @param v1
	 * @return this vector subtract v1 vector
	 */
	public Vector subtract(Vector v1) {
		double xx=x-v1.x;
		double yy = y-v1.y;
		double zz = z-v1.z;
		
		return new Vector(xx, yy, zz);
	}
	
	/**
	 * 
	 * @param v1
	 * @return this vector plus v1 vector
	 */
	 
	public Vector add(Vector v1) {
		double xx=x+v1.x;
		double yy = y+v1.y;
		double zz = z+v1.z;
		
		return new Vector(xx, yy, zz);
	}
	
	/**
	 * 
	 * @param num
	 * @return this vector mul scalar
	 */
	
	public Vector scale (double num) {
		double xx = x*num;
		double yy = y*num;
		double zz = z*num;
		
		return new Vector(xx,yy,zz);

	}
	/**
	 * 
	 * @param v
	 * @return this vector dot v vector
	 * 
	 * https://www.geeksforgeeks.org/program-dot-product-cross-product-two-vector/
	 */
	
	
	public double dotProduct(Vector b) 
    { 
  
        double product = 0; 
  
        // Loop for calculate cot product 
            product = x * b.getX(); 
            product += y * b.getY(); 
            product += z * b.getZ(); 

            
        return product; 
    } 
	/**
	 * 
	 * @param v
	 * @return vector mul between this vector to v vector
	 * i used this link help: https://www.geeksforgeeks.org/program-dot-product-cross-product-two-vector/
	 */
	
	public Vector crossProduct(Vector v) { // 
	  
		    double xx = this.y * v.z - this.z * v.y; 
		    double yy = this.z * v.x - this.x * v.z; 
		    double zz = this.x * v.y - this.y * v.x; 
		    
		    return new Vector (xx,yy,zz);
		
		  

	}
	
	/**
	 * 
	 * @param p
	 * @return the 2D angel between the vectors
	 * I build this function a year ago for another project
	 */
	
	public double north_angle(Vector p) {
		double ans = 0;
		double a_rad = Math.atan2((p.y-y), (p.x-x));
		double a_deg = Math.toDegrees(a_rad);
		if(a_deg<=90) ans = 90-a_deg;
		else ans = 450-a_deg;
		return ans;
	}
	/**
	 * 
	 * @return length Squared of this vector
	 */
	public double lengthSquared() {
		 return ((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));		
	}

	/**
	 * 
	 * @return the size of this vector - i saw this function after i build the size parameter above
	 */
	public double length() {
	return Math.sqrt(lengthSquared());
	
	}
/**
 * normalize this vector
 */
	public void normalize () {
		
		double length = length();
	       x = y/length;
	       y = y/length;
	       z=z/length;
	
	}
	
	/**
	 * 
	 * @return new normalize vector by this vector
	 */
	      public Vector normalized() {
	  		
	  		double length = length();
	  	       double xx = this.x/length;
	  	     double yy = this.y/length;
	  	     double zz = this.z/length;
	  	     	return new Vector(xx,yy,zz);  	     
	  	
	      }

	      /**
	       * to string function
	       */
	      public String toString() {
	    	  return ("x: "+x
	    			  +"y: "+y
	    			  +"z: " +z
	    			  +"\nsize= " +size);
	      }
}