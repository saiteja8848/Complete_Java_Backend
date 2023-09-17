package A_oops;




/**
 * 
 * @author saiteja 
 * 
 * Interview questions on classes and objects
 * 
 * 
 * 1) define class ?
 *  -> A class is a user defined template/ or a blueprint / or a prototype,
 *   which helps to map the real world entity by using it.
 *  
 *  -> class can be declared only once, no memory is occupied for class creation
 *  -> objects are created from class. example : Car
 *  -> class is a collection of a group of variables of different types && different
 *  group of methods
 *  
 *  2)Define the syntax of the class and what it contains ?
 *    <AccessSpecifier> class <className> {
 *       1. <AccessSpecifier> dataMembers(attributes/state)
 *       2. <AccessSpecifier> dataMethods(actions/behaviour)
 *       3. <AccessSpecifier> constructor() (for constructing objects)
 *       4. <AccessSpecifier> innerClasses{}
 *       5. <AccessSpecifier> interface{}
 *    }
 *    
 * 3) Examples of class ?
 *    Animal, Car, Company, Student, Bird , Person, Position, Profession etc
 * 
 * 4)define object ?
 *    An object is the instance of the class. It is a physical entity, so Every 
 *    object in general have identity, state and actions,
 *    so memory is allocated for object.
 * 
 * 5)Examples of object ?
 *   Class Car {} --> objects are bmw, audi, benz, porshce, etc   
 *   
 * 
 * 6)Default package in java ?
 *    java.lang --> JDK internally by default imports this package
 *    
 * 7)Concept of static and non-static ?
 *  A)Non-static
 *  -->In simple terms, all instance reference variables are called as non-static
 *       since they don't consume the memory
 *  -->It means, we can say that we have -> instance variables/methods/blocks/classes
 *  
 *  B)Static
 *  --> Static is applied to a variable/method/inner class/blocks
 *  --> It is mainly used for efficient memory usage - since it allocates memory only once
 *  --> If all the instance of a class share common property/method - we can define them using static
 *  --> example: All the students belong to same college, we can define college name as static
 *  --> memory is allocated at runtime/execution of the program.
 *  --> Its is a non access modifier and it makes independent of the objects
 *  
 *  so to conclude, we have
 *  
 *   --> static inner classes vs instance classes
 *   --> static blocks vs instance blocks
 *   --> static variable vs non-static or instance variable
 *   --> static method vs non-static or instance method
 *  
 *  Note1 : A static method can call only static methods/static variables
 *          But It cannot call instance/non-static methods or variables
 *          
 *  Note2 : A non-static or instance variable can able to access static-variable/methods.
 *           
 * 
 * Note 3: It is regarding constructor
 *        - if constructor is set as private - we cann't create object for that class
 *        - because whenever we are trying to create an object for a class, jvm calls the constructor first
 *        - so if it  private, it won't able to access
 *        - If we don't provide any constructor - jvm internally creates no-args defualt constructor
 *        - If we override the constructor - then we have to explictly create the no-args constructor    
 *
 */





class Address {

	private String streetName;
	private String doorNumber;
	private String cityName;
	
	Address(){
		
	}

	Address(String streetName, String doorNumber, String cityName) {
		super();
		this.streetName = streetName;
		this.doorNumber = doorNumber;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", doorNumber=" + doorNumber + ", cityName=" + cityName + "]";
	}

}

class Contact {

	private String contactName;
	private String contactNumber;
	private Address address;
	private String mailId;

	Contact(String contactName, String contactNumber, Address address, String mailId) {
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", mailId=" + mailId + "]";
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		Contact contact = new Contact("saiteja", "8179678237", new Address(), "saiteja8848@gmail.com");
		System.out.println(contact);
	}

}
