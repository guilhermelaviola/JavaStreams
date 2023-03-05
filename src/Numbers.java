import java.util.stream.IntStream;

// Basic example
public class Numbers {

	public static void main(String[] args) {
		int[] numbers = {5, 7, 14, 2, 3, 9, 6, 0};

		// Traditional way (without Streams)
		int min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(min < numbers[i]) {
				min = numbers[i];
			}
		}
		
		System.out.println("Minimum: " + min);
		
		// With Java Streams
		System.out.println("Minimum with Java Streams");
		IntStream.of(numbers).min().getAsInt();
			
		// Will only print the number if it exists in the Array,
		// so the Array must not be empty
		
		// With lambda function 
		IntStream.of(numbers).min().ifPresent(minimum -> System.out.println(minimum));
		// or with static method reference
		IntStream.of(numbers).min().ifPresent(System.out::println);
		
		// Just like minimum, there are methods for similar purposes as well
		System.out.println("Maximum:");
		IntStream.of(numbers).max().getAsInt();
		
		System.out.println("Average:");
		IntStream.of(numbers).average();
		
		System.out.println("Count:");
		IntStream.of(numbers).count();
		
		System.out.println("Sum:");
		IntStream.of(numbers).sum();
		
	}
}
