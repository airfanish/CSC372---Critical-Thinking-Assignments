package CriticalThinking;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		//add 10 student objects to the list
		students.add(new Student(1, "Sam", "2124 Short Street"));
		students.add(new Student(6, "Joe", "3006 Gateway Avenue"));
		students.add(new Student(3, "Gabby", "994 Woodhill Avenue"));
		students.add(new Student(9, "Sarah", "4679 Goodwin Avenue"));
		students.add(new Student(5, "John", "1345 Illinois Avenue"));
		students.add(new Student(2, "Melissa", "1469 Kerry Way"));
		students.add(new Student(10, "Lisa", "874 Wildwood Street"));
		students.add(new Student(8, "Corry", "3612 Norma Lane"));
		students.add(new Student(4, "Cindy", "1903 Rosebud Avenue"));
		students.add(new Student(7, "Harry", "3767 Jessie Street"));
		
		//display students before sorting
		System.out.println("Unsorted student list:");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		//print sorted list by name
		SelectionSort.selectionSort(students, new NameComparator());
		
		System.out.println("\nSorted by name: ");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		//print sorted list by rollNum
		SelectionSort.selectionSort(students, new RollNumComparator());
		
		System.out.println("\nSorted by roll number: ");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
