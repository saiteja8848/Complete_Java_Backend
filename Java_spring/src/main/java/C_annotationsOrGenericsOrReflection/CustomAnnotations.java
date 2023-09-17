package C_annotationsOrGenericsOrReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
class Cat{
	
	String name;
	int age;
	
	public Cat(String name) {
		this.name=name;
	}
	
	@RunImmediately(times=3)
	public void meow() {
		System.out.println("Meow!");
	}
	
	public void eat() {
		System.out.println("Munch");
	}
}








public class CustomAnnotations {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		Cat myCat = new Cat("Stella");
		
		//Class Level Annotation
		if(myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This thing is very Important");
		}else {
			System.out.println("This thing is not very important");
		}
		
		//Method Level
		for(Method method : myCat.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately annotation = method.getAnnotation(RunImmediately.class);
				for(int i=0;i<annotation.times();i++) {
					method.invoke(myCat);
				}
				
			}
		}
		
		

	}

}
