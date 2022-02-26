package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 4, 7, 3, 2, 12, 8, 33, 22, 9, 2);
		int sum = addListNumbers(numbers);
		System.out.println(sum);
	}

	private static int addListNumbers(List<Integer> numbers) {

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		return sum;

	}

}
