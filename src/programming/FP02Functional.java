package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 4, 7, 3, 2, 12, 8, 33, 22, 9, 2);
		// int sum = addListNumbers(numbers);
		// int sumOfSquares = sumOfSquares(numbers);
		//int cubeOfSquares = cubeOfSquares(numbers);
		int sumOfOdd = sumOfOdd(numbers);
		System.out.println(sumOfOdd);
	}

	private static int addListNumbers(List<Integer> numbers) {

		return numbers.stream()
				// .reduce(0, FP02Functional::add); //using method reference
				// .reduce(0, (x,y) -> x + y); // using lambda expression
				.reduce(0, Integer::sum); // using predefined method of class Integer
	}

	private static int sumOfSquares(List<Integer> numbers) {

		return numbers.stream().map(x -> x * x).reduce(0, Integer::sum);

	}

	private static int cubeOfSquares(List<Integer> numbers) {

		return numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);

	}
	
	private static int sumOfOdd(List<Integer> numbers) {

		return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
				
	}
	

}
