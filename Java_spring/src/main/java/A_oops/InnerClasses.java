package A_oops;

/**
 * 
 * @author saiteja
 * 
 * Note1:Class and Objects are the basic and fundamental units of a oops concepts
 * 
 * Note2: A class can contain - nested inner classes and nested interfaces.
 * we have concept of static/non static - so same goes here
 * 
 *  Nested class : A class defined inside a class is called a Nested class.
 *  static class should always be nested.
 *  
 * Types of Nested class:
 *  1.static nested inner class
 *  2.non-static nested inner class
 *  3.Method local nested inner class
 *  4.Anonymous nested class and object
 *  5.Nested Interface - a interface inside a class/interface
 *  
 * Use of nested classes or interfaces ?
 * 	1.helps to provide more readable and maintainable code because it logically groups
 *   classes and interfaces in one place.
 *
 *
 * Pending : anonymous class/object/method creation 
 * 
 *
 */



// Example : 1 Nested Interface inside an interface 
interface MyInterfaceA{  
    void display(); 
    
    //By default and always public, static
    public static interface MyInterfaceB{  
        void myMethod();  
    }  
}  
      
class NestedInterfaceDemo1 implements MyInterfaceA.MyInterfaceB{  
     public void myMethod(){
         System.out.println("Nested interface method");
     }  
      
     public static void main(String args[]){  
         MyInterfaceA.MyInterfaceB obj=new NestedInterfaceDemo1(); 
         obj.myMethod();  
     }  
}

// Nested Interface inside a class example :
class MyClass{  
    interface MyInterfaceB{  
        void myMethod();  
    }
}  
    
class NestedInterfaceDemo2 implements MyClass.MyInterfaceB{  
     public void myMethod(){
         System.out.println("Nested interface method");
     }  
    
     public static void main(String args[]){  
        MyClass.MyInterfaceB obj=new NestedInterfaceDemo2();  
        obj.myMethod();  
     }  
}

// Nested local inner class - non static example:
class Pizza{
	
	long price;
	String pizzaName;
	String topings;
	
	//it is non-static, so it also instance member
	class SpecialTopings {
		String getTopings(String choice) {
			return "pista";
		}
	}
	
	//static nested class 
    static class DefaultTopics{
    	static String setTopings() {
    		return "Masala onions";
    	}
    }	
	
    void setTopings(String choice) {
    	if(choice==null)
    		this.topings = DefaultTopics.setTopings();
    	else {
    		SpecialTopings sp = new SpecialTopings();
    	    this.topings = sp.getTopings("PISTA");
    	}
    }
	
	
	
}


public class InnerClasses {
	public static void main(String[] args) {
	}
}
