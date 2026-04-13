package CriticalThinking;

//create class cylinder
public class Cylinder extends Shape {
	
	//attribute radius & height
	private double radius;
	private double height;
		
	//constructor
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
		
	//Implement surface_area for cylinder
	@Override
	public double surface_area() {
	    return ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}
	
	//Implement volume method
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * height);
	}
		
	//call toString()
	public String toString() {
		return ("The surface area of a cylinder is " + surface_area() + " and the volume of a cylinder is " + volume());
		}
	}