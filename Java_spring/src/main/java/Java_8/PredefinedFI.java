package Java_8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFI {

	public static void main(String[] args) {
		//Function 
		Function<Integer, String> toStringFunction = n -> String.valueOf(n);
		String result = toStringFunction.apply(42); // result is "42"
		
		Function<String, Integer> strLength = str -> str.length();
		int length = strLength.apply("Hello"); // length is 5
  
		IntFunction<Double> squareRoot = n -> Math.sqrt(n);
		double result11 = squareRoot.apply(25); // result is 5.0

    
		//Predicate 
		Predicate<Integer> isEven = n -> n % 2 == 0;
		boolean even = isEven.test(10); // even is true
   
		//Consumer
		Consumer<String> printMessage = message -> System.out.println(message);
		printMessage.accept("Hello, World!"); // prints "Hello, World!"

 
		//Supplier
		Supplier<Double> randomDouble = () -> Math.random();
		double value = randomDouble.get(); // generates a random double value
   
		//Unary
		UnaryOperator<Integer> square = n -> n * n;
		int result1 = square.apply(5); // result is 25
      
		
		//BiFunction
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		int sum = add.apply(3, 5); // sum is 8

		
	}

}
