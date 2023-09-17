package A_oops;



/**
 * 
 * @author saiteja
 *
 * 1. Need of ecapsulation?
 *    - Data hiding -hiding the internal data with in the class to prevent its direct access outside of the class
 *    - to make class data- only set - writeOnly or get - readOnly and read-write-only
 *    - Java bean is a full encapsulated class 
 * 
 * 2. Define ecapsulation ?
 *    - wrapping of the data and methods that act up on the data is called as object
 *    - encapsulation  is a process of making the instance variable as private and restricting the access outside
 *    of the class to other
 *    - we can provide the logic at the time on setting data, similarly manipulate at the time of getting it
 * 
 * 3. Define package?
 *     Package - it is a group of similar types of classes, interface and sub-packages together
 *     - we have inbuilt packages and we can create our own package and publish
 *     - Advantages of packages is "Grouping", "Protection" and "Resolves NamingCollisions"
 * 
 * 
 * 4. Define access specifier, Types of access specifiers and their scope ?
 *     Access specifiers/modifiers - It defines the accessibility or level of scope for a "class", "method" and 
 *     "variables", "constructor". we can changes the level of access for the mentioned ones.
 *     
 *     Types of access modifiers in java :
 *      - private : access level is with in the class, not outside of the same class file, sub-package
 *      - default : Scope is only with in the package, outside of the packages won't work and its by default one
 *      - protected : with in the package + outside of package(Only to the subclass)
 *      - public : everywhere - within the package + outside of the package
 * 
 * 
 * 5. Implement encapsulation ?
 *      To make a class as fully encapsulated one
 *       - Make all the data members of the class as private
 *       - provide getters/setters based on the business-logic
 *       
 *  
 *
 */

// I make this class read-only, once we set the data, we cann't modify it
class Person{
	
	final private String name;
	final private int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	

}


public class EncapsulationDemo {
	public static void main(String[] args) {
		Person person = new Person("saiteja",26);
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}
}
