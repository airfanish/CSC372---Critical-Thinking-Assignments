package CriticalThinking;

//imports
import java.util.ArrayList;
import java.util.Comparator;

//build the selection sort tool to call in main
public class SelectionSort {
	
	public static void selectionSort(ArrayList<Student> students, Comparator<Student> comp) {
		
		//declare variables
		int i;
		int j;
		int indexSmallest;
		
		//for loop that starts at index 0, goes up to size of list and moves forward 1 index at a time
		for (i = 0; i < students.size() - 1; ++i) {
			
			//find index of smallest remaining element
			indexSmallest = i;
			
			for (j = i + 1; j < students.size(); ++j) {
				
				//find the smallest element in the remaining part of the list
				if (comp.compare(students.get(j), students.get(indexSmallest)) < 0) {
					indexSmallest = j;
				}
			}
			
			//swap numbers[i] and numbers[indexSmallest]
			Student temp = students.get(i);
			students.set(i, students.get(indexSmallest));
			students.set(indexSmallest, temp);
		}
	}
	

}
