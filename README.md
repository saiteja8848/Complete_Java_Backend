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
<Summary>Annotations && Reflection</Summary>
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
<Summary>Collections framework && Comparable, comparator Interfaces</Summary>
</details>


<details>
<Summary>Multithreading</Summary>
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



