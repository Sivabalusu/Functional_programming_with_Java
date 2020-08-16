package functional;

import java.util.List;

public class FP01Excercises {

	public static void main(String[] args) 
	{
		List<Integer> numbers = List.of(12,4,3,5,65,22,11,14,9,6,8);
		List<String> courses=List.of("Java","Spring","Hibernate","JPA","Android","HTML","Spring Boot");
		System.out.println("------Odd Numbers------");
		printOddNumbers(numbers);
		System.out.println("------All courses-------");
		printAllCourses(courses);
		System.out.println("-----Spring courses--------");
		printSpringCourses(courses);
		System.out.println("-----Courses with name length >4--------");
		printLongNameCourses(courses);
		System.out.println("-----print cubes of odd numbers--------");
		printCubesofOddNumbers(numbers);
	}

	private static void printOddNumbers(List<Integer> numbers) {
		//convert list to stream
		numbers.stream().filter(number->number%2!=0)  //--Using Lambda expressions.
			.forEach(System.out::println);
	}
	private static void printAllCourses(List<String> courses)
	{
		courses.stream()
			   .forEach(System.out::println);
	}
	private static void printSpringCourses(List<String> courses)
	{
		courses.stream()
				.filter(course->course.contains("Spring"))
			   .forEach(System.out::println);
	}
	private static void printLongNameCourses(List<String> courses) 
	{
		courses.stream()
		.filter(course->course.length()>4)
		.map(course->course+" length- "+course.length())
	   .forEach(System.out::println);
	}

	private static void printCubesofOddNumbers(List<Integer> numbers) 
	{
		numbers.stream()
			.filter(number->number%2==1)
			.map(number->(int)Math.pow(number,3))
			.forEach(System.out::println);
	}
	
}
