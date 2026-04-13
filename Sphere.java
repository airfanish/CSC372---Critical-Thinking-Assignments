package CriticalThinking;

//Create a class Sphere that extends the Shape class
public class Sphere extends Shape {

	//attribute radius
	private double radius;
	
	// constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	//Implement surface_area method
	@Override
	public double surface_area() {
		return (4 * Math.PI * Math.pow(radius, 2));
	}
	
	//Implement volume method
	@Override
	public double volume() {
		return ((4.0/3) * Math.PI * Math.pow(radius, 3));
	}

	//call toString
	public String toString() {
		return ("The surface area of a sphere is " + surface_area() + " and the volume of a sphere is " + volume());
	}
}