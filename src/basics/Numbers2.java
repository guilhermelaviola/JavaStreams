package basics;

import java.util.Arrays;
import java.util.stream.IntStream;

// Finding 3 distinct smallest numbers
public class Numbers2 {
	public static void main(String[] args) {
		int[] numbers = { 5, 7, 14, 2, 3, 9, 6, 0 };

		// Avoid matching the original array by creating
		// a copy of the original array
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		// Sorting the array (ascending order)
		Arrays.sort(copy);

		// Picking the first 3 values
		// Without Java Streams
		System.out.println("Without Java Streams:");
		for (int i = 0; i < 3; i++) {
			System.out.println(copy[i] +  ", ");
		}

		// With Streams
		System.out.println("With Java Streams");
		// Creating the Stream
		IntStream.of(numbers)
				// Processing the Stream
				.distinct().sorted().limit(3)
				// Consuming the Stream
				.forEach(System.out::println);
		
		// Is there any odd number in the sequence?
		IntStream.range(0, 50).anyMatch(x -> x % 2 == 1);
		// Are all numbers in the sequence odd?
		IntStream.range(0, 50).allMatch(x -> x % 2 == 1);
	}
}
