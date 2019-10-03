
public class Triangle extends Shape {
	double semi;
	double sideOne = 0;
	double sideTwo = 0;
	double sideThree = 0;
	
	//Constructor
	public Triangle(Point corner, double sideOne, double sideTwo, double sideThree) {
		this.position = corner;
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	// Calculate semi-perimeter
	semi = ( (sideOne + sideTwo + sideThree) / 2);
	
	// Print area
	public double computeArea() {
		
	}
	
	// Print area
	public double computePerimeter() {
		return (2 * semi);
		
	}
}
