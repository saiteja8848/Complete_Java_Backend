package A_oops;


/**
 * 
 * 
 * @author saiteja
 * 
 * 1. Need of abstraction and Define abstraction ?
 *     Need :
 *       1. It reduces the complexity in viewing the things - as it shows only functionality's
 *       2. Avoids code duplications and increases codeReusablity
 *       3. It can change internal implementation of class Independently without effecting the user.
 *       4. Decoupling and a contract - we can say
 *    
 *    Abstraction:Hiding the Implementation details and showing only the functionality's.
 *    
 * 2. How to provide abstraction in java ?
 *    There are 2 ways to implement abstraction concept in java
 *    A) Abstract classes (0-100% abstraction - as we can implement common functionality's of subclasses in abstract clas)
 *       - it can have constructor, abstract and concrete methods, final/static/non-static variables as well
 *    B) Interfaces(100% abstraction)
 *        - only abstract methods
 *        - from java 8 and 9, we can have - default / static methods - MAJOR CHANGE for soul of interface
 *            - Reason for providing default method in interface
 *            - Lets a take scenario where we have created a contract
 *               interface animal{
 *                  void poop();
 *                  
 *                  //Incase in some point of time, if we add any new abstract method in between
 *                   like // void legs(); ---> this method has to be implemented by all the existing classes forcedly
 *                 So to avoid such cases
 *                 
 *                  // no need to implement forcedly
 *                  default public void legs(){
 *                    System.out.println("I am having legs to walk")
 *                  } 
 *                  
 *               }  
 *              Class Dog implements animal{}
 *              Class Fish implements animal{}
 *              
 *   3. Difference between abstract class vs interface ?
 *     i) Abstract class have can both abstract/non abstract methods - Interface can have abstract/default/static
 *     ii) Abstract doesn't support multiple inheritance(OneChild - multipleParents)- but with interface its possible    
 *     iii)Abstract class can have non-static+static+final variables - Interface - only static+final
 *     iv) Abstract class extends other class where as Interface - extends only interface
 *     v) Abstract class can have - public,protected,private members - interface can only have public && default
 *     vi) Need to use abstract keyword in abstract class - Interface by default compiler takes care.
 *     
 *  Note : we can run abstract class if it has main method but interface not possible       
 * 
 *  4) When to use abstract class and when to go for interface ?
 *     interface : only contract
 *     abstract class : contract+common implementation for reuse
 *     So when sub classes have common properties go for abstract class
 * 
 * 
 *
 */


abstract class TestMain {
	
	public static void main(String[] args) {
		System.out.println("main method inside abstract class");
	}
	
}


abstract class Animal{
	
	private String name;
	private int age;
	
	Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeNoise();
	
	void printDetails() {
		System.out.println("My name is:"+name+ " and I am "+age+" years old");
	}
}

//This contract has be signed and implementation also done
interface  animalStuff{
	void poop();
	
	//In future, we add an abstract method, all the implementated classes will break
	//void getBread(); - uncomment it and see - it will break- show errors unimplemented
	// so to avoid this add default keyword
	default void getBread() {};
	
}

class Dog extends Animal implements animalStuff{

	//Reusing name and age properties
	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void poop() {
		System.out.println("sajedkwsarhfeawjrwoepppppppp");
	}

	@Override
	public void makeNoise() {
		super.printDetails();
		System.out.println("barking.... bow.. bow");
	}
	
	 // when overriding default- always add public specifier
	 public void getBread() {
		 System.out.println();
	 }
	
}

class Fish extends Animal implements animalStuff{

	Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public void poop() {
	  System.out.println("edjaws rfawefe");
	}

	@Override
	public void makeNoise() {
	  super.printDetails();
	  System.out.println("I don't make noise");	
	}
	
	// here we are not implemention the default method - so we are paritionlly siging the contract
	
}

public class AbstractionDemo {

	public static void main(String[] args) {

	}

}
