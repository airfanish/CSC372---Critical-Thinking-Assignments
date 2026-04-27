package CriticalThinking;

import java.util.Comparator;

//declare comparator class
public class RollNumComparator implements Comparator<Student> {
		
		public int compare(Student student1, Student student2) {
			return student1.rollNum - student2.rollNum;
		}
	}

