package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 4, 7, 3, 2, 12, 8, 33, 22, 9, 2);
		int sum = addListNumbers(numbers);
		System.out.println(sum);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

	private static int addListNumbers(List<Integer> numbers) {

	return	numbers.stream()
			.reduce(0, FP02Functional::add);

	}

}
