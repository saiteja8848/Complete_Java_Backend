# Complete_Java_Backend




<details>
<Summary>Java 8 Features</Summary>
<h2>Lambda Expressions && Functional Interfaces</h2>
  
```
interface Pen{
     void write();
}

class Bluepen implements Pen{
    public void write(){
        System.out.println("Writing with blue pen....");
    }
}


public class Main {
   
   public static void main(String[] args) {
      Bluepen bluePen = new Bluepen();
      takeNotes(bluePen);
   }
  
   public static void takeNotes(Pen pen){
      pen.write();
   }
}
```

<h2>Predefined Functional Interfaces</h2>


</details>



