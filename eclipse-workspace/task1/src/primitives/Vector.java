package primitives;

public class Vector {

	//private double size; // I added it because it seems basic to me
	//private double angel; // I added it because it seems basic to me - i didn't have time to finish the auto calc inside the contructors
	private Point3D p1; 

	/**
	 * getters
	 * @return
	 */
	public double getX() {
		return p1.getX();
	}

	
	public double getY() {
		return p1.getY();
	}

	public double getZ() {
		return p1.getZ();
	}

	
public void setP1(Point3D p1) {
		this.p1 = p1;
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
 		
		p1 = new Point3D(x1,y1,z1);
		
	//	size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));

	}

//	public Vector(double size, double angel, double x, double y, double z) {
//		if(x==0&&y==0&&z==0) throw new IllegalArgumentException("you can't add 0!!");// in case of zero vector the progrem will throw IllegalArgumentException
//		p1 = new Point3D(x,y,z);
//
//		this.size = size;
//		this.angel = angel;
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
	public Vector(Point3D p) {
		if(p.getX()==0&&p.getY()==0&&p.getZ()==0) throw new IllegalArgumentException("you can't add 0!!");// in case of zero vector the progrem will throw IllegalArgumentException

		p1 = new Point3D(p);
	
	//	size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));
		
	}
	public Vector(Vector v) {
		if(v.getX()==0&&v.getY()==0&&v.getZ()==0) throw new IllegalArgumentException("you can't add 0!!");// in case of zero vector the progrem will throw IllegalArgumentException

		p1 = new Point3D(v.getX(),v.getY(),v.getZ());
		
		//size = Math.sqrt((this.x)*(this.x)+(this.y)*(this.y)+(this.z)*(this.z));

	}
	/**
	 * 
	 * @param v1
	 * @return this vector subtract v1 vector
	 */
	public Vector subtract(Vector v1) {
		double xx=  p1.getX()-v1.getX();
		double yy = p1.getY()-v1.getY();
		double zz = p1.getZ()-v1.getZ();
		
		return new Vector(xx, yy, zz);
	}
	
	/**
	 * 
	 * @param v1
	 * @return this vector plus v1 vector
	 */
	 
	public Vector add(Vector v1) {
		double xx=p1.getX()+v1.getX();
		double yy = p1.getY()+v1.getY();
		double zz = p1.getZ()+v1.getZ();
		
		return new Vector(xx, yy, zz);
	}
	
	/**
	 * 
	 * @param num
	 * @return this vector mul scalar
	 */
	
	public Vector scale (double num) {
		double xx = p1.getX()*num;
		double yy = p1.getY()*num;
		double zz = p1.getZ()*num;
		
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
            product = p1.getX() * b.getX(); 
            product += p1.getY() * b.getY(); 
            product += p1.getZ() * b.getZ(); 

            
        return product; 
    } 
	/**
	 * 
	 * @param v
	 * @return vector mul between this vector to v vector
	 * i used this link help: https://www.geeksforgeeks.org/program-dot-product-cross-product-two-vector/
	 */
	
	public Vector crossProduct(Vector v) { // 
	  
		    double xx = p1.getY() * v.getZ() - p1.getZ() * v.getY(); 
		    double yy = p1.getZ() * v.getX() - p1.getX() * v.getZ(); 
		    double zz = p1.getX() * v.getY() - p1.getY() * v.getX(); 
		    
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
		double a_rad = Math.atan2((p.getY()-p1.getY()), (p.getX()-p1.getX()));
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
		 return ((p1.getX())*(p1.getX())+(p1.getY())*(p1.getY())+(p1.getZ())*(p1.getZ()));		
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
public Vector normalize () {
		
	
		double length = length();

	       this.p1.setX(p1.getX()/length);
	       this.p1.setY(p1.getY()/length);
	       this.p1.setZ(p1.getZ()/length);

	
	return this;
	}
	
	/**
	 * 
	 * @return new normalize vector by this vector
	 */
	      public Vector normalized() {
	  		
	  		double length = length();
	  	  
	  	     	return new Vector(p1.getX()/length,p1.getY()/length,p1.getZ()/length);  	     

	      }

	      @Override
	      public boolean equals(Object v1) {
	    	  if (this==v1) return true; // check the reference first
	    	  
	    	  if (!(v1 instanceof Vector)) return false;  //test for: is p1 is Vector type?
			
	    	  Vector v = (Vector) v1;  // cast v1 to vector after the test above
	    	  return(p1.equals(v.p1));
	      }
	      /**
	       * to string function
	       */
	    
	@Override
	public String toString() {
		return "Vector [p1=" + p1.toString() + "]";
	}

	public static boolean isZero(double num) {
		
		return num==0;
	}
	      
}