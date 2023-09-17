package A_oops;


/**
 * 
 * @author saiteja
 * 
 *  1. Define polymorphism ?
 *     - Ability of an object to take in different forms (or) One object in many forms
 *     - example : Frog -> is a terrestrial animal and also aquatic animal
 *     - In java, we have two types of polymorphism 
 *      A) Compile-time (or) static : This is can be achieved by "Method Overloading"
 *      B) Run-time (or) dynamic : This can be achieved by "Method overriding"
 *   
 *  2. Define method overloading and its rules ?
 *      Same method name but difference in terrms of "Number of params" (OR) in type of params passed
 *      then those methods are termed as overloaded methods.
 *      RESOLUTION : HAPPENS AT COMPILE TIME - REFERENCE VARIABLE
 *      Rules : 
 *       i) Same name
 *       ii) Same return Type - we cann't overload based on returnType - ambiguity problem happens
 *       iii) Difference in no of parameters passed / type of parameters passed/
 *      
 *  3. Define type promotion?
 *     - Type promotion is done when overloading is happening.
 *     - when there is no matching dataType in overloaded method, then smaller type promoted to higher type.
 *     - We can only promote the dataType, but we cann't depromote
 *        order : byte -> short -> int -> long
 *        order : char -> int
 *        order : float -> double
 *        order : long -> double/float
 *        order : int -> doub/e/float
 *  
 *  4. can we overload main and static methods ?
 *     YES, we can overload main and static methods based on the above rules.
 *  
 *  5. Define method overriding ?
 *      Method overriding occurs when a subclass provides particular implementation of a method that is declared in parent class.
 *      RESOLUTION : METHOD OVERRIDING HAPPENS AT RUNTIME - BASED ON REFERCE OBJECT
 *      NOTE 1: method overriding happens only for methods
 *    
 *  6. Define method overriding with respect to variables (or) shadowing (or) variable hiding ?
 *       NOTE 2: method overriding with respect happens only with reference variableType - both static/non-static
 *       IF parent and sub-types classes have same name variable then we say its variable hiding or shadowing
 *  
 *  7. Method overriding with return Type - co variant Type and access-specifier scope for overridden method? 
 *     From 5, we can override based on return Types - we can use same type or child type of it
 *     scope of the overridden method is increased or same access-specifier is used.
 *     
 *  8. We cann't override static methods -since they bound at compile time   
 * 
 */

class Parent{
	
 String parentName;

 Parent(){
	 this.parentName="parent";
 }
 
 Parent(String name){
	 this.parentName = name;
 }
 
 void printName() {
	 System.out.println(this.parentName);
 }
 
}

class Subtype extends Parent{

	String name;
	String test;
	
	Subtype(){
		this.name="subType";
		this.test="subType-child";
	}
	
	Subtype(String name) {
		
		super(name); // NOTE: THIS IS THE FIRST STMT
		this.name=name;
		this.test="child";
	}

// here we can use printName method of parent + we can extend it by overriding it
  
	public void printName() {
		super.printName();
		System.out.println(this.name +"   "+this.test);
	}

}


public class PolymorphismDemo {
	
	static void overload(String name) {
		System.out.println(name);
	}
	
	static void overload(Object name) {
		System.out.println(name);
	}
	
	static void overload1(int x) {
		System.out.println(x);
	}
	
	static void overload1(Integer x) {
		System.out.println("WRAPPER"+x);
	}
	
	static void overload2(int x, long y) {
		System.out.println(x+y);
	}
	
	static void overload2(long x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Parent p = new Parent();
//         p.printName();
//         
//         System.out.println("**********");
//         
//         p = new Subtype();
//         p.printName();
		
		overload("TEST"); // WORKS FINE- SINCE MATCH
		overload1(1); // ok
		//overload2(1,1); //The method overload2(int, long) is ambiguous for the type PolymorphismDemo
	}

}
