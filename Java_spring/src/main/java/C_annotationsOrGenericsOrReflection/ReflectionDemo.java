package C_annotationsOrGenericsOrReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * 
 * @author saiteja
 * 
 * Reflection : It Examines, inspect and modify the runtime behavior of an applications
 * classes and objects.
 * 
 * Reflection takes the program as input and its actual input 
 *  
 * Its a JVM Language, we can say
 * 
 * Use case : why do we need to modify the runtime behaviour classes ?
 * 1. serialization/deserialization internally uses reflection
 * 2. Spring dependency Injection
 * 3. Junit testing framework
 * 4. Debuggers
 * 5. javac, javap, java all these types of commands
 * 6. and many more etc
 * 
 * java.lang.reflect  and  java.lang.Class - are 2 packages helps 
 * provides useful methods to work with reflection 
 * 
 * 2 Things reflection does
 * ========================
 *  
 *  1. Get the metadata of a class/object/interface
 *     - Call the getClass of that particular object
 *  2. modify its behaviour changing its value
 *  
 *  examples of metadata for a class
 *  i.fields - Fields
 *  ii.methods - Methods
 *  iii.constructors - Constructor
 *  iv. modifiers - Modifiers
 *  v. interfaces
 *  vi. annotations
 *  vi. subclasses
 *  vi. superclasses
 *  https://jenkov.com/tutorials/java-reflection/classes.html
 *  etc
 */

interface animal{
	public abstract void name();
	public abstract void animalType();
}

class Dog implements animal{
	
	String name;
	String animalType;
	
	Dog(String name, String animalType){
		this.name = name;
		this.animalType = animalType;
	}

	@Override
	public void name() {
	   System.out.println("animalName:"+this.name);
	}

	@Override
	public void animalType() {
		System.out.println("animalType:"+this.animalType);
	} 
	
}


public class ReflectionDemo {

	public static void main(String[] args) {
    
	  //Step 1: Call the getClass method on the object	
	  Dog dog = new Dog("puppy","DOG");
	  Class<? extends Dog> dogInstance = dog.getClass(); //Instance
	  //Class<Dog> dogClass = Dog.class; //Class
	  
	  //Step2: Metadata
	  Field[] fields = dogInstance.getFields();
	  System.out.println(fields.toString());
	  Method[] methods = dogInstance.getMethods();
	  System.out.println(methods.toString());
	  @SuppressWarnings("rawtypes")
	  Constructor[] constructors = dogInstance.getConstructors();
	  System.out.println(constructors.toString());
	  System.out.println(dogInstance.getInterfaces());
	  System.out.println(dogInstance.getSuperclass());
	  System.out.println(dogInstance.getSuperclass());
	  System.out.println(dogInstance.getModifiers());
	  System.out.println(dogInstance.getAnnotations());
	  System.out.println(dogInstance.getCanonicalName());
	  System.out.println(dogInstance.getComponentType());
	  System.out.println(dogInstance.getName());
	  System.out.println(dogInstance.getPackage());
	  System.out.println(dogInstance.getPackageName());
	  dogInstance.getTypeName();
	  dogInstance.getEnumConstants();
	  dogInstance.getClassLoader();
	  dogInstance.getTypeParameters();
	  dogInstance.getClasses();
	  dogInstance.getDeclaredConstructors();
	  
	  //Step 3: Modify the behaviour of the class at runTime
	  
	  
	}

}
