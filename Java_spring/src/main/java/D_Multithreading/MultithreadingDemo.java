package D_Multithreading;


/***
 * @author saiteja
 * 
 * 
 * Multi-threading is a process of executing multiple threads simultaneously
 * 
 * 1. what is a thread ?
 *   A thread is a light weight sub-process, the smallest unit of processing - used to achieve multitasking
 *   
 * 
 * 2. how many ways to create threads in java and how ?
 *  There are 2 ways to create threads in java and they by 
 *  	- Implementing Runnable Interface run method
 *      - extending thread class and overriding run method of thread class
 * 
 * 3. which one is best way of creating thread ?
 *    - better way of creating the thread in java is by - implementing the runnable interface
 *      because of 2 reasons 
 *        - java doesn't support multiple inheritance (a child should n't be having 2 parents), so if we extending then it cann't extend any other classes
 *        - To achieve Multi-threading we just need to override run() of threading class, but if we inherit we are Thread class - all thread class methods are inherited - overhead 
 *      
 * 4. How to start a thread in case of inheriting and in case of implementing interface ?
 *     - In case of implementing Runnable interface, we have to pass the implementing class object to Thread class constructor and call thread class start() method
 *     - In case of extending Thread class, we call the parent class thread method
 *     
 * 5. What if we don't call the thread class start method ?
 *     - Each thread has a seperate call stack
 *     - Invoking run method directly goes call on the current stack rather creating a new call stack 
 * 
 * 6. can we start thread twice like t1.start() and t1.start() again?
 *   No, it will throw an exception - Exception in thread "main" java.lang.IllegalThreadStateException
 * 
 * 7. explain thread life cycle and about thread scheduler and thread scheduling algorithms ?
 *    Thread life cycle :
 *      - New : thread not started yet, but instance has been created
 *      - active : when we invoke - thread.start - it moves either running /runnable
 *      - Blocked/waiting 
 *      - Time based waiting
 *      - Terminated
 *   - Thread scheduler is a component in jvm decides which thread to run and which one to stop by using some algorithm
 *   - Thread can be picked on 2 basis a. Thread Priority b.Time of arrival
 *   - Thread scheduler algorithms are 
 *      a. First come first serve
 *      b. Time slicing
 *      c. preemptive priority       
 *      
 *  8. explain about thread join()  and Daemon thread ?
 *  
 *  9. Explain about Thread pool and group, fork ?
 *  
 *  10.what is critical section ? and what is synchronization
 * 
 *     
 *
 *
 */



class Test implements Runnable{
	public void run(){
		System.out.println("thread started.");
	}
}

class Test2 extends Thread{
	public void run(){
		System.out.println("thread started.");
	}
}

public class MultithreadingDemo {
	public static void main(String[] args) {
		
		//Implementing thread class
		Thread thrd = new Thread(new Test());
		thrd.start();
		
		//Extending Thread class
		Test2 thrd1 = new Test2();
		thrd1.start();

	}
}
