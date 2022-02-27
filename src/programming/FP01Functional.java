package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 4, 7, 3, 2, 12, 6, 35, 21, 9, 2);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker","Kubernetes");
		// printAllNumbersInListFunctional(numbers);
		// printEvenNumbersInListFunctional(numbers);
		//printOddNumbersInListFunctional(numbers);
		//printCoursesIndividually(courses);
		//printWordIndividually(courses);
		//printFourLettersOnly(courses);
		//printSquersOfEvenNumbersInListFunctional(numbers);
		//printCubesOfOddNumbersInListFunctional(numbers);
		printNoOfWordsCoursesIndividually(courses);
	}


	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven) //Applying filter for even nos.
				.filter(number -> number % 2 == 0) // Using Lambda Expression
				.forEach(System.out::println);

	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven) //Applying filter for even nos.
				.filter(number -> number % 2 != 0) // Using Lambda Expression
				.forEach(System.out::println);

	}

	private static void printCoursesIndividually(List<String> courses) {
		courses.stream()
		.forEach(System.out::println);
	}
	
	private static void printWordIndividually(List<String> courses) {
		courses.stream()
			.filter(course -> course.contains("Spring")) // Lambda Expression
			.forEach(System.out::println);
	}
	
	private static void printFourLettersOnly(List<String> courses) {
		courses.stream()
			.filter(course -> course.length() >= 4) // Lambda Expression
			.forEach(System.out::println);
	}
	
	private static void printSquersOfEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				.filter(number -> number % 2 == 0) // Using Lambda Expression
				.map(number -> number * number) // using map to find square
				.forEach(System.out::println);

	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				.filter(number -> number % 2 != 0) // Using Lambda Expression
				.map(number -> number*number*number)
				.forEach(System.out::println);

	}
	
	private static void printNoOfWordsCoursesIndividually(List<String> courses) {
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
	}
	
}
