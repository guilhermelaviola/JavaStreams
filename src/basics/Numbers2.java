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

		// Without Java Streams
		for (int i = 0; i < 3; i++) {
			System.out.println(copy[i]);
		}

		// With Streams
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
	}
}
