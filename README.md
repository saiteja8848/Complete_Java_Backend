# Complete_Java_Backend




<details>
<Summary>Object oriented Programming Concepts</Summary>
</details>


<details>
<Summary>Exception Handling</Summary>
</details>


<details>
<Summary>Generics</Summary>
</details>



<details>
<Summary>Object class methods(hashCode and equals contract)</Summary>
</details>

<details>
<Summary>Cloning - deep && shallow cloning</Summary>
</details>

<details>
<Summary>Serialization && Deserialization</Summary>
</details>

<details>
<Summary>Wrapper classes, String,StringBuffer and StringBuilder</Summary>
</details>

<details>
<Summary>Collections framework && Comparable, comparator Interfaces</Summary>
</details>


<details>
<Summary>Multithreading</Summary>
</details>


<details>
<Summary>Annotations && Reflection</Summary>
</details>

<details>
<Summary>Java 8 Features</Summary>
<h6>1. Lambda Expressions && Functional Interfaces</h6>


Syntax for lambda expressions

```
1.syntax - No need to add return statement in case of single line expression
(parameters) -> expression

2.Multiple Parameters Lambda
(x) -> x * 2

3.Lambda with No Parameters
(a, b) -> a + b

4.Block Lambda with Multiple Statements
() -> "Hello, World!"

5.Lambda with Method Reference
(x, y) -> {
    int sum = x + y;
    return sum;
}

6.Lambda with Type Declaration
(int x, int y) -> x * y

```

Example of lambda expression

```
@FunctionalInerface
interface Pen{
     void write(); // Single abstract method + any no of abstract and default methods
}

class Bluepen implements Pen{
    public void write(){
        System.out.println("Writing with blue pen....");
    }
}

public class Main {
   public static void main(String[] args) { 
      //Without Lambda expressions
      Bluepen bluePen = new Bluepen();
      takeNotes(bluePen);
      
      //with lambda expressions
      Pen pen = ()->System.out.println("Writing with blue pen....");
      takeNotes(pen);
   }

   public static void takeNotes(Pen pen){
      pen.write();
   }
}
```

<br>
<h6> 2.Method references</h6>

 - method references are a shorthand notation that allows you to refer to a method without actually invoking it
 - They provide a way to pass methods as arguments to functions or assign them to variables, making your code more concise and readable.
 - Method references are often used in functional programming and with features like the Stream API
 - There are four types of method references in Java

```

1.Reference to a Static Method: You can refer to a static method of a class using the class name
// Using a lambda expression
Function<Integer, Double> squareRoot = x -> Math.sqrt(x);

// Using a method reference
Function<Integer, Double> squareRootRef = Math::sqrt;


2.Reference to an Instance Method of a Particular Object: You can reference an instance method of a specific object by specifying the object before the method name.

String str = "Hello, World!";

// Using a lambda expression
Function<Integer, Character> charAt = i -> str.charAt(i);

// Using a method reference
Function<Integer, Character> charAtRef = str::charAt;


3.Reference to an Instance Method of an Arbitrary Object of a Particular Type:
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using a lambda expression
names.forEach(name -> System.out.println(name));

// Using a method reference
names.forEach(System.out::println);


4.Reference to a Constructor: You can reference a constructor using the Class::new syntax
// Using a lambda expression
Supplier<String> stringSupplier = () -> new String();

// Using a constructor reference
Supplier<String> stringSupplierRef = String::new;

```

<br>
<h6> 3.Predefined Functional Interfaces and there examples</h6>



<br>
<h6> 4.Optionals </h6>


<br>
<h6> 5.Stream Intro, classes and interfaces</h6>


<br>
<h6> 6.Relation ship between stream and functional interfaces</h6>


<br>
<h6> 7.Date and Time API</h6>


</details>



