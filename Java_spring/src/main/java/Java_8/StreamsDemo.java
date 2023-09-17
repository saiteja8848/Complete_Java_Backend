package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	 public static void main(String[] args) {
	        // Create a list of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Intermediate Operations
	        Stream<Integer> stream = numbers.stream();

	        // 1. Filter
	        Stream<Integer> filtered = stream.filter(n -> n % 2 == 0);

	        // 2. Map
	        Stream<Integer> mapped = filtered.map(n -> n * n);

	        // 3. FlatMap (Example with words)
	        Stream<String> words = Stream.of("Hello", "World");
	        Stream<Character> flatMapped = words.flatMap(word -> word.chars().mapToObj(c -> (char) c));

	        // 4. Distinct
	        Stream<Integer> distinct = mapped.distinct();

	        // 5. Sorted
	        Stream<Integer> sorted = distinct.sorted();

	        // 6. Peek
	        Stream<Integer> peeked = sorted.peek(System.out::println);

	        // Terminal Operations
	        // Note: Streams are single-use; you may need to recreate them.
	        List<Integer> result = peeked.collect(Collectors.toList());

	        // 7. ForEach
	        result.forEach(System.out::println);

	        // 8. Count
	        long count = numbers.stream().count();
	        System.out.println("Count: " + count);

	        // 9. Min
	        int min = numbers.stream().min(Integer::compare).orElse(0);
	        System.out.println("Min: " + min);

	        // 10. Max
	        int max = numbers.stream().max(Integer::compare).orElse(0);
	        System.out.println("Max: " + max);

	        // 11. AnyMatch
	        boolean anyMatch = numbers.stream().anyMatch(n -> n > 8);
	        System.out.println("Any Match: " + anyMatch);

	        // 12. AllMatch
	        boolean allMatch = numbers.stream().allMatch(n -> n > 0);
	        System.out.println("All Match: " + allMatch);

	        // 13. NoneMatch
	        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
	        System.out.println("None Match: " + noneMatch);

	        // 14. Reduce
	        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
	        System.out.println("Sum: " + sum);
	    }

}
