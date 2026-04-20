package CriticalThinking;

import java.util.Scanner;

public class RecursionProgram {
	public static void main(String[] args) {
		
		//create array to store user's input of 5 numbers
		int[] number = new int[5];
		
		//using scanner to read user input
		Scanner scr = new Scanner(System.in);
		
		//for loop to iterate 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			
			//validates input
			if (scr.hasNextInt()) {
				number[i] = scr.nextInt();
			}
			else {
				System.out.println("Error: Incorrect Input. Enter a whole number.");
				scr.next(); //discard the invalid input
				i--; //stay on the same index
			}				
			}
		scr.close();
		
		//calls recursive method, stores results and prints final product
		int multResult = multiplyNums(number, 0);
		System.out.println("The product is: " + multResult);
	}

	//creating the recursive method to provide the product of all five numbers
	
	public static int multiplyNums(int[] number, int i) {
		
		//base case
		if (i == number.length) {
			return 1;
		}
		//recursive case
		else {
			return (number[i] * multiplyNums(number, i + 1));
		}
	}
}
