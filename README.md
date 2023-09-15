# Complete_Java_Backend




<details>
<Summary>Java 8 Features</Summary>
<h6>Lambda Expressions && Functional Interfaces</h6>


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

<h6>Method references</h6>



<h6>Predefined Functional Interfaces</h6>


</details>



