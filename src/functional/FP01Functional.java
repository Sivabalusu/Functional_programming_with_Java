package functional;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) 
	{
		List<Integer> numbers = List.of(12,4,3,5,65,22,11,14,9,6,8);
		//printAllNumbers(numbers);
		printEvenNumbers(numbers);

	}
	
	//1st approach - creating a function to traverse through list.
	public static void print(int number)
	{
		System.out.println(number);
	}

	private static void printAllNumbers(List<Integer> numbers)
	{
		//Convert the list into streams number.stream()
		//what we do with stream print each number of the stream
		//-- various approaches
		
		//1st approach
		//:: is used we are not calling function with ().
		//numbers.stream().forEach(FP01Functional::print);
		
		//2nd approach --directly printing with sysout.
		numbers.stream().forEach(System.out::println);
	}
	public static boolean isEven(int number)
	{
		return number%2==0;
	}
	private static void printEvenNumbers(List<Integer> numbers) {
		//convert list to stream
		numbers.stream()
			  // .filter(FP01Functional::isEven) //--using function call
				.filter(number->number%2==0)  //--Using Lambda expressions.
			.forEach(System.out::println);
		//with the help of lambda expressions we don't need function
	}
	
}
