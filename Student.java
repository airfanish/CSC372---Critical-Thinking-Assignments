package CriticalThinking;

public class Student {

	//declare variables to make up a student
	int rollNum;
	String name;
	String address;
	
	//constructor
	public Student(int rollNum, String name, String address) {
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
		}
	
	public String toString() {
		return rollNum + " - " + name + " - " + address;
	}
}