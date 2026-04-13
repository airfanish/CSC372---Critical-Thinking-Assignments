package CriticalThinking;

//create class cone
public class Cone extends Shape {
		
	//attributes radius
	private double radius;
	private double height;
		
	//constructor
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	//Implement surface_Area for cone
	@Override
	public double surface_area() {
		return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
	}
	
	//Implement volume method
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * (height/3.0));
	}
	
	//call toString()
	public String toString() {
		return ("The surface area of a cone is " + surface_area() + " and the volume of a cone is " + volume());
		}
	}