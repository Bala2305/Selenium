import java.awt.geom.Area;

public class demo1R {

	
	private double length;
	private double breadth;
	
	
	public double getLength() {
		return length;
	}



	public void setLength(double l) {
		length = l;
	}



	public double getBreadth() {
		return breadth;
	}



	public void setBreadth(double b) {
		breadth = b;
	}



	public  double area() {
		
return length * breadth;
	}
	
	
	
	public double perimeter() {
 return 2*(length * breadth);
	}
	
	
	public boolean isSquare() {
	if (length==breadth) {
		
		return true;

		
	} else {
return false;
	}
	}

	
}
