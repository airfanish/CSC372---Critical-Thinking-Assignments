package CriticalThinking;

//create class ShapeArray
public class ShapeArray {
	public static void main(String[] args) {
			
			//Instantiate objects
			Sphere sphere = new Sphere(1);
			Cylinder cylinder = new Cylinder(2, 2);
			Cone cone = new Cone(2, 2);
			
			//create array
			Shape[] shapeArray = {
					sphere,
					cylinder,
					cone};
			
			//create for loop and print each object
			for (Shape s : shapeArray) {
				System.out.println(s);
			}	
		}
	}