package A_oops;

/**
 * @author saiteja
 * 
 * Questions
 * 
 * 1. How to define collection of constants ?
 * 2. How to represent a group of named constants in a programming language ?
 * 3. How you used to store list of constants ?
 * 
 * 
 * So, Normal way to write constant JDK1.5 prior before enum.
 * 
 * interface Months {
 *    public static final int JAN=0;
 *    public static final int FEB=1;
 * }
 * 
 * interface Gender{
 *     public static final int MALE=0;
 *     public static final int FEMALE=1;
 * }
 * 
 * Problems with above approach:
 *
 *  1. If we want to print all month constant, we cann't
 *  2. There is no way to iterate over all the Constants
 *  3. Even we cann't obtain the size of these constants.
 *  4. Complier won't complain if we try to compare two different types of enums
 *       If(Months.JAN == Gender.MALE){}
 *       
 *       
 * So for the above problem - enum is introduced in java from 1.5 version
 * Java's enum(enumeration - the act of mentioning no of things one by one) types are full fledged class
 * It can have 
 *   - CONSTANTS
 *   - VARIABLES
 *   - CONSTRUCTORS
 *   - METHODS
 *   - ABSTRACT METHODS
 *   Just similar to a any Java class
 *   enum by default extends to Java.lang.enum class
 *   
 *   
 *   NOTE 1: we have enumSet, enumMap as well similar to map and set, in terms performance they are fast
 *   
 *   NOTE 2: Enum is a solution for singleton design pattern
 *   As it solves all problem with normal way of writing Singleton class like
 *   "Serializable" , "Reflection" and "Threading"
 *   
 *   Therefore it is 100% guaranteed that only one instance of the singleton is present with in a JVM
 *   
 *   
 *         
 *
 *
 *
 *
 *
 *
 *
 */

enum Months{
	JANUARY,
	FEBUARY,
	MARCH,
	APRIL,
	MAY;
}



//Parameterized Enum - we have pass via constructor
enum TrafficLight{
	
	//Constants
	RED(30){
		@Override
		public  TrafficLight nextLight() {
			return GREEN;
		}
	}, 
	YELLOW(10){
		@Override
		public  TrafficLight nextLight() {
			return RED;
		}
	},
	GREEN(30){
		@Override
		public  TrafficLight nextLight() {
			return YELLOW;
		}
	};
	
	
	//variable
	private int duration;
	
	//constructor
	TrafficLight(int duration){
		this.duration=duration;
	}
	
	//method
	public int getDuration() {
		return this.duration;
	}
	
	//Abstract method
	public abstract TrafficLight nextLight();
	
	
}



public class EnumDemo {
	static void basicEnumExample() {
		System.out.println(Months.values());
		System.out.println(Months.valueOf("JANUARY"));
		System.out.println();
		for(Months month : Months.values()) {
			System.out.println(month);
		}
		
	System.out.println("************************");	
		// How to get specific constant details
		Months month = Months.APRIL;
		System.out.println(month.toString());
		System.out.println(month.ordinal());
		System.out.println(month.getDeclaringClass());
		System.out.println(month.hashCode());
		System.out.println(month.equals(Months.APRIL));
		System.out.println(month.equals(Months.JANUARY));
		System.out.println(month.compareTo(Months.APRIL));
	}
	
	public static void enumParamDemo() {
		
		for(TrafficLight light:TrafficLight.values()) {
			System.out.printf("%s : Please wait %d seconds, next is %s\n",light,light.getDuration(),light.nextLight());
		}
	}
	
	
	public static void main(String[] args) {
		basicEnumExample();
	    enumParamDemo();
	}
}
