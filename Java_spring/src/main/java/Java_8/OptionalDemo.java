package Java_8;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String name = getName();

		if (name != null) {
			System.out.println("Name: " + name);
		} else {
			System.out.println("Name is null");
		}

		// With optionals

		Optional<String> name1 = Optional.ofNullable(getName());

		if (name1.isPresent()) {
			System.out.println("Name: " + name1.get());
		} else {
			System.out.println("Name is absent");
		}

		// example 3

		Optional<String> name3 = getNameById();
		name3.ifPresent(n -> System.out.println("Name: " + n));
	}

	public static String getName() {
		return null;
	}

	public static Optional<String> getNameById() {
		return Optional.ofNullable(null);
	}
}

class allOptionalMethods {

	public static void main() {
		// Creating Optionals
		Optional<String> presentOptional = Optional.of("Hello");
		Optional<String> emptyOptional = Optional.empty();
		Optional<String> nullableOptional = Optional.ofNullable(null);

		// isPresent() example
		System.out.println("Is presentOptional present? " + presentOptional.isPresent()); // true
		System.out.println("Is emptyOptional present? " + emptyOptional.isPresent()); // false

		// ifPresent() example
		presentOptional.ifPresent(value -> System.out.println("Value: " + value)); // Value: Hello

		// orElse() example
		String result1 = emptyOptional.orElse("Default Value");
		System.out.println("Result1: " + result1); // Result1: Default Value

		// orElseGet() example
		String result2 = emptyOptional.orElseGet(() -> generateDefaultValue());
		System.out.println("Result2: " + result2); // Result2: Default Value

		// orElseThrow() example
		try {
			String result3 = emptyOptional.orElseThrow(() -> new IllegalArgumentException("No value present"));
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage()); // Exception: No value present
		}

		// map() example
		Optional<Integer> lengthOptional = presentOptional.map(value -> value.length());
		System.out.println("Length of presentOptional: " + lengthOptional.orElse(0)); // Length of presentOptional: 5

		// filter() example
		Optional<String> filteredOptional = presentOptional.filter(value -> value.startsWith("H"));
		System.out.println("Filtered Optional: " + filteredOptional.orElse("No match")); // Filtered Optional: Hello
	}

	public static String generateDefaultValue() {
	        return "Default Value";
        }
}

/**
 * 
 * of(T value)
 * ofNullable(T value)
 * empty()
 * isPresent()
 * ifPresent(Consumer<? super T> action)
 * ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
 * orElse(T other)
 * orElseGet(Supplier<? extends T> supplier)
 * orElseThrow(Supplier<? extends X> exceptionSupplier)
 * map(Function<? super T, ? extends U> mapper)
 * flatMap(Function<? super T, Optional<U>> mapper)
 * filter(Predicate<? super T> predicate)
 * equals(Object obj) and hashCode()
 */
