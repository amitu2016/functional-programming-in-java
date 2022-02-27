package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 4, 7, 3, 2, 12, 8, 33, 22, 9, 2);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker","Kubernetes");
		// int sum = addListNumbers(numbers);
		// int sumOfSquares = sumOfSquares(numbers);
		//int cubeOfSquares = cubeOfSquares(numbers);
		//int sumOfOdd = sumOfOdd(numbers);
		//List<Integer> doubleList = doubleList(numbers);
		//List<Integer> evenList = evenList(numbers);
		List<Integer> courseStringCount = courseStringCount(courses);
		System.out.println(courseStringCount);
	}

	private static List<Integer> courseStringCount(List<String> courses) {
		
		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}

	private static List<Integer> evenList(List<Integer> numbers) {

		return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
	
		return numbers.stream().map(x -> x * x).collect(Collectors.toList());
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
