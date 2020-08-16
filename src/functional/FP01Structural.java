package functional;

import java.util.List;

public class FP01Structural {

	public static void main(String[] args) 
	{
		List<Integer> numbers = List.of(12,4,3,5,65,22,11,14,9,6,8);
		//printAllNumbers(numbers);
		printEvenNumbers(numbers);

	}

	private static void printAllNumbers(List<Integer> numbers)
	{
		for(int number:numbers)
		{
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbers(List<Integer> numbers)
	{
		for(int number:numbers)
		{
			if(number%2==0) {
				System.out.println(number);
			}
		}
	}
}
