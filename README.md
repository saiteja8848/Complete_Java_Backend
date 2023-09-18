# Complete_Java_Backend




<details>
<Summary>Object oriented Programming Concepts</Summary>

<h6>Class(Static) & Object(Non-static or Instance)</h6>

``` 
        
        Class
            - A class in Java is a blueprint or template for creating objects.
            - It defines the structure and behavior that objects created from the class will have. 
            - It consists of instance variables(fields/properties), methods(actions/behavior) and construtors(initilization), nested classes.
            - It is a logical entity.
            - To access class level methods or fields- we have to define them as static fields or static methods.
            - By default every class is child class of Object class in java - we can use object class methods on every class - inheritance.

        Object
           - It is a physical entity, it takes up the memory space
           - we use new keyword to create an instance of the class called object.
           - when we call new keyword on a class for creating object, it first invokes constructor - which is used to initializing fields.

      Example :

               // Define a class named "Person"
                class Person {
                    // Fields (attributes)
                    String name;
                    int age;
                
                    // Constructor
                    public Person(String name, int age) {
                        this.name = name;
                        this.age = age;
                    }
        
                    // Method to display information about the person
                    public void displayInfo() {
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                    }
        }

            public class Main {
                public static void main(String[] args) {
                    // Create an object of the "Person" class
                    Person person1 = new Person("Alice", 30);
            
                    // Call the "displayInfo" method on the object
                    person1.displayInfo();
            
                    // Create another object of the "Person" class
                    Person person2 = new Person("Bob", 25);
            
                    // Call the "displayInfo" method on the second object
                    person2.displayInfo();
                }
            }


Static and Non-static:
======================
Fields:
=======
Static Fields:
    i. A static field is shared among all instances of a class (memory allocated only once and shared accross the objects).
    ii.Changes to a static field affect all instances and are persistent across objects.
Non-Static Fields:
   i.A non-static field is unique to each instance of a class.
   ii.Changes to a non-static field only affect the specific instance they are associated with

Syntax:
ClassName.staticField
ClassName.staticMethod()

Methods:
========
	Static Methods:
        i. A static method can be called on the class itself, without creating an instance.
        ii. Static methods cannot access non-static (instance) members directly, as they don't have access to an object's state.
Non-Static Methods:
        i. Non-static methods are associated with instances and can access both static and non-static members of the class.
        ii.They have access to the instance's state through the this keyword.

Syntax:
object.nonStaticField
object.nonStaticMethod()

Note 1 : Atleast one class in java file should always be public, if we don't explicitly define the class as public,
         else JVM by default takes fileName as public class name

Note 2 : JVM checks for public class and inside that public class - will check for "public static void main(String[] args)" method as this
         is start point for execution of program - we don't need to create instance of the class so it should be "static"


Static blocks && Instance blocks, instanceof keyword
====================================================

Example: static block
=====================
public class StaticBlockExample {

   // A static initialization block is executed when the class is loaded into memory,
   // and it runs only once, regardless of how many instances of the class are created.
   // It's typically used for class-level initialization.
   static {
        System.out.println("This is a static initialization block.");
    }

    public StaticBlockExample() {
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) {
        StaticBlockExample obj1 = new StaticBlockExample();
        StaticBlockExample obj2 = new StaticBlockExample();
    }
}

Example : instance block
========================

//An instance initialization block is executed when an instance of the class is created even before the construtor
// It's useful for performing instance-specific initialization. gets loaded for every new instance creation
public class InstanceBlockExample {
    {
        System.out.println("This is an instance initialization block.");
    }

    public InstanceBlockExample() {
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) {
        InstanceBlockExample obj1 = new InstanceBlockExample();
        InstanceBlockExample obj2 = new InstanceBlockExample();
    }
}

instanceof keyword example :
============================
class Animal {
    // This is the base class.
}

class Dog extends Animal {
    // This is a subclass of Animal.
}

class Cat extends Animal {
    // This is another subclass of Animal.
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Creating a Dog object and assigning it to an Animal reference.
        testAnimalType(animal);
        
        animal = new Cat(); // Creating a Cat object and assigning it to the same Animal reference.
        testAnimalType(animal);
    }

    public static void testAnimalType(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("It's a Dog!");
        } else if (animal instanceof Cat) {
            System.out.println("It's a Cat!");
        } else if (animal instanceof Animal) {
            System.out.println("It's an Animal!");
        } else {
            System.out.println("Unknown type");
        }
    }
}
// It's a Dog!
// It's a Cat!

What are the default values assigned to variables and instances in java?
- There are no default values assigned to the variables in java.
We need to initialize the value before using it. Otherwise, it will throw a compilation error of (Variable might not be initialized). 
- But for instance, if we create the object,
then the default value will be initialized by the default constructor depending on the data type. 
- If it is a reference, then it will be assigned to null. 
- If it is numeric, then it will assign to 0.
- If it is a boolean, then it will be assigned to false. Etc

```
    
<h6>Encapuslation(Access specifiers,packages, using getters/setters)</h6>


Packages : A package is a way to organize related classes and interfaces into a group or namespace.
- Preventing Name Conflicts
- Access Control
- Code Reusability
- package keyword is used to define a package and import is used to add a package
- By default java packages are - ![Alt Text](https://www.freetimelearning.com/java/uploadingimages/package%20in%20java.png)

Access modifiers : 
- Access modifiers in Java are keywords that control the visibility and accessibility of classes, fields (variables), methods (functions), and constructors within a Java program.
- They determine which parts of your code can be accessed from other classes or packages
![Alt Text](https://logicmojo.com/assets/dist/new_pages/images/access-modifiers-in-oops.png)

![Alt Text](https://1.bp.blogspot.com/-GCbzAxJ3_t8/XeqabcPeFCI/AAAAAAAABRY/LTJz83SB0zw9Ur7SNaEb2wMg3-QiEmuIACLcBGAsYHQ/s640/Access_Modifier.png)

```

Encapsulation :
===============
It is a mechanism in Java that bundles data (attributes) and the methods (functions) 
that operate on that data into a single unit known as a class.

- It hides the internal implementation details of a class, promoting information hiding.
- It provides a well-defined and controlled interface to interact with the object.
- Encapsulation begins by declaring the fields (variables) of a class as private.
- This means that the fields can only be accessed directly from within the class.
To allow controlled access to the private fields, you provide public methods (getters and setters) within the class.
These methods are used to read and modify the private field values.
   - Getter methods (e.g., getMethodName) retrieve the values of private fields.
   - Setter methods (e.g., setMethodName) modify the values of private fields.


Example of encapuslation :
--------------------------

public class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Using the setter method to validate and set age
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Age validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Access and modify object's properties using getter and setter methods
        person.setAge(32);
        person.displayInfo();
    }
}




```

<h6>Abstraction(Interface, Abstract class, Interfaces vs abstract class)</h6>



```
Abstraction :
-------------
- Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
The trivial or the non-essential units are not displayed to the user.
- Encapsulation  is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding)
- In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Reasons for abstraction :
- To achieve loosely coupling
- To achieve security - hide certain details and only show the important details of an object.



Example for interface:
======================

// Define the Connectable interface
interface Connectable {
    void connectToInternet();
}

// Implementing classes
class Smartphone implements Connectable {
    private String brand;

    public Smartphone(String brand) {
        this.brand = brand;
    }

    @Override
    public void connectToInternet() {
        System.out.println(brand + " smartphone is connecting to the internet.");
    }
}

class Laptop implements Connectable {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public void connectToInternet() {
        System.out.println(brand + " laptop is connecting to the internet.");
    }
}

class Tablet implements Connectable {
    private String brand;

    public Tablet(String brand) {
        this.brand = brand;
    }

    @Override
    public void connectToInternet() {
        System.out.println(brand + " tablet is connecting to the internet.");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iPhone");
        Laptop dell = new Laptop("Dell");
        Tablet samsung = new Tablet("Samsung");

        iphone.connectToInternet();
        dell.connectToInternet();
        samsung.connectToInternet();
    }
}

Example for abstract class
==========================

// Abstract class representing an Electronic Device
abstract class ElectronicDevice {
    private String brand;
    private String model;
    private boolean poweredOn;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.poweredOn = false; // Devices start in a powered-off state
    }

    // Abstract method for turning on the device (to be implemented by subclasses)
    public abstract void powerOn();

    // Abstract method for turning off the device (to be implemented by subclasses)
    public abstract void powerOff();

    // Concrete method for displaying device information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Powered On: " + poweredOn);
    }
}

// Concrete subclass for smartphones
class Smartphone extends ElectronicDevice {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void powerOn() {
        System.out.println("Booting up the smartphone...");
        poweredOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("Shutting down the smartphone...");
        poweredOn = false;
    }

    // Additional smartphone-specific methods can be added here
}

// Concrete subclass for laptops
class Laptop extends ElectronicDevice {
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void powerOn() {
        System.out.println("Booting up the laptop...");
        poweredOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("Shutting down the laptop...");
        poweredOn = false;
    }

    // Additional laptop-specific methods can be added here
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Apple", "iPhone 12");
        Laptop myLaptop = new Laptop("Dell", "XPS 13");

        myPhone.displayInfo();
        myPhone.powerOn();
        myPhone.displayInfo();
        myPhone.powerOff();
        myPhone.displayInfo();

        System.out.println();

        myLaptop.displayInfo();
        myLaptop.powerOn();
        myLaptop.displayInfo();
        myLaptop.powerOff();
        myLaptop.displayInfo();
    }
}

```

- Differences between abstract class and interface

![Alt Text](https://i.pinimg.com/736x/02/ba/9c/02ba9c498b5e09b7c3f35a6c4bcfac82.jpg)





<h6>Polymorphism(Method overloading(Static/compile time binding)&method overriding(Runtime/Dynamic binding- reference type))</h6>

A)Method overloading
B)Method Overriding



<h6>Inheritance(types of inheritance, diamond problem, Reusabality)</h6>

![Alt Text](https://i0.wp.com/www.tutorialspoint.com/java/images/types_of_inheritance.jpg?zoom=2)

https://javagoal.com/multiple-inheritances-in-java/

</details>



<details>
<Summary>Exception Handling</Summary>
</details>

<details>
<Summary>Nested classes,Interfaces and enum</Summary>
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
     - Java provides predefined functional interfaces which are avaliable in java.util.function package

![alt text](https://www.falkhausen.de/Java-8/java.util/function.png)


```
import java.util.function.Supplier;

public class FunctionInterfaces {
    public static void main(String[] args) {


      //  1.Supplier  : Represents a supplier of results without taking any input.
        Supplier<String> supplier = () -> "Hello, World!";
        String result = supplier.get();
        System.out.println(result); // Output: Hello, World!


        //2. Consumer : Represents an operation that takes an input argument and returns no result.
        Consumer<String> consumer = message -> System.out.println("Message: " + message);
        consumer.accept("Hello, Consumer!");

        //3.Predicate : Represents a boolean-valued function of one argument.
        Predicate<Integer> isEven = number -> number % 2 == 0;
        boolean result = isEven.test(4);
        System.out.println("Is 4 even? " + result); // Output: Is 4 even? true


        //4.Function : Represents a function that takes an argument of type T and produces a result of type R
        Function<Integer, String> intToString = number -> "Number: " + number;
        String result = intToString.apply(42);
        System.out.println(result); // Output: Number: 42


        // 5..UnaryOperator<T> : Represents an operation on a single operand of type T that produces a result of the same type T.
        UnaryOperator<Integer> square = number -> number * number;
        int result = square.apply(5);
        System.out.println("Square of 5: " + result); // Output: Square of 5: 25

        //6. BinaryOperator<T>: Represents an operation upon two operands of type T that produces a result of the same type T. 
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(3, 7);
        System.out.println("3 + 7 = " + result); // Output: 3 + 7 = 10

    }
}


```

     


<br>
<h6> 4.Optionals </h6>
     - The Optional class in Java is part of the java.util package and was introduced in Java 8
     - It is used to represent an object that may or may not contain a non-null value
     - The purpose of Optional is to handle scenarios where you have an object that can be null, and it provides a more robust and safe way to work with such values to avoid null pointer exceptions.

```

//1. empty() : Returns an empty Optional instance.
Optional<String> emptyOptional = Optional.empty();


//2. of(T value) : Creates an Optional containing the given non-null value.
Optional<String> nonEmptyOptional = Optional.of("Hello");


//3.ofNullable(T value) : Creates an Optional containing the given value if it's non-null; otherwise, returns an empty Optional.
String nullableValue = null;
Optional<String> optional = Optional.ofNullable(nullableValue); // Creates an empty Optional


//4.isPresent() : Returns true if there is a value present in the Optional, otherwise false.
Optional<String> optional = Optional.of("Hello");
boolean isPresent = optional.isPresent(); // Returns true

//5.ifPresent(Consumer<T> consumer) : Executes the given consumer function if a value is present.
Optional<String> optional = Optional.of("Hello");
optional.ifPresent(value -> System.out.println("Value: " + value)); // Prints "Value: Hello"

//6.orElse(T other) : Returns the value if present; otherwise, returns the specified default value.
Optional<String> optional = Optional.empty();
String result = optional.orElse("Default"); // result will be "Default"


//7.orElseGet(Supplier<T> supplier) : Returns the value if present; otherwise, returns the result of the specified supplier function.
Optional<String> optional = Optional.empty();
String result = optional.orElseGet(() -> "Default"); // result will be "Default"


//8.orElseThrow(Supplier<? extends X> exceptionSupplier) :  Returns the value if present; otherwise, throws an exception generated by the provided supplier.
Optional<String> optional = Optional.empty();
String result = optional.orElseThrow(() -> new NoSuchElementException("No value present"));

//9.map(Function<? super T, ? extends U> mapper) : If a value is present, applies the given mapping function to it and returns an Optional containing the result.
Optional<String> optional = Optional.of("Hello");
Optional<Integer> lengthOptional = optional.map(String::length); // Contains the length, i.e., 5

//10.filter(Predicate<? super T> predicate) : If a value is present and satisfies the given predicate, returns the Optional; otherwise, returns an empty Optional.
Optional<Integer> optional = Optional.of(42);
Optional<Integer> filteredOptional = optional.filter(num -> num > 50); // Returns an empty Optional


```
     

<br>
<h6> 5.Stream Intro, classes and interfaces</h6>


![Alt Text](https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/stream-api-intro/images/stream-api.png)

Please check the collection class methods and Stream support class methods

![Alt Text](https://www.falkhausen.de/Java-8/java.util/stream/Collectors.png)



![Alt Text](https://www.falkhausen.de/Java-8/java.util/stream/StreamSupport.png)


![Alt Text](https://www.falkhausen.de/Java-8/java.util/stream/Stream.png)

<br>
<h6> 6.Relation ship between stream and functional interfaces</h6>



```
Example 1: **fliter, map and collect**

  fliter : Stream<T> filter(Predicate<? super T> predicate) - Predicate : checks for true or false and adds to stream
  map : <R> Stream<R> map(Function<? super T, ? extends R> mapper) - Function :  that takes an argument of type T and produces a result of type R
  collect : <R, A> R collect(Collector<? super T, A, R> collector) -  collecting elements from a stream into a specific type of collection.
  Collector : public static <T> Collector<T, ?, List<T>> toList() -  Collector is a class and it has many static methods - one such method is toList

  Conclusion :
    - .map , .filter and .collect are abstract methods defined by the Stream interface in Java, they accept predefined functional interface as arguments or parameters in java
    - So The actual implementation of these methods depends on the specific stream type.

   List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  



 Example 2 : Reduce example

 reduce :
  - Many times, we need to perform operations where a stream reduces to single resultant value, Reducing is the repeated process of combining all elements.
  - reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the         current stream element. (Identity, accumlator and combiner)
  - T reduce(T identity, BinaryOperator<T> accumulator) - identity is initial value of type T and accumulator is a function for combining two values 
  -  Optional<T> reduce(BinaryOperator<T> accumulator) - overloaded one

      case 1 : summing all the elements
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
        // Finding sum of all elements
        int sum = array.stream().reduce(0, (element1, element2) -> element1 + element2); // 16

        int product = IntStream.range(2, 8)
                     .reduce((num1, num2) -> num1 * num2)
                     .orElse(-1);


      case 2 : comparing against all strings to find the max length string

        List<String> words = Arrays.asList("GFG", "Geeks", "for",  "GeeksQuiz", "GeeksforGeeks");
  
        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream().reduce((word1, word2)-> word1.length() > word2.length() ? word1 : word2);
        longestString.ifPresent(System.out::println); //GeeksforGeeks

     case 3: combing different strings into one single string

        String[] array = { "Geeks", "for", "Geeks" };
  
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                                           .reduce((str1, str2)
                                           -> str1 + "-" + str2);
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get()); // Geeks-for-Geeks
        }

```

<br>
<h6> 7.Date and Time API</h6>


</details>



