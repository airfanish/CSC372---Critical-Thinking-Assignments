package CriticalThinking;

import java.util.Comparator;

//declare comparator class
public class NameComparator implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		return student1.name.compareTo(student2.name);
		
	}
}

