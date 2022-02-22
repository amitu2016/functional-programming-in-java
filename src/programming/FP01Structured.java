package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,4,7,3,2,12,8,33,22,9,2);
		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//How to solve: Using loops
		for(Integer number: numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//How to solve: Using loops
		System.out.println("Even Nos");
		for(Integer number: numbers) {
			if (number % 2 ==0) 
			System.out.println(number);
		}
	}

}
