package Java_8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentCollections {
	   public static void main(String[] args) throws InterruptedException {
	        // ConcurrentHashMap
	        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
	        concurrentMap.put("one", 1);
	        concurrentMap.put("two", 2);
	        concurrentMap.put("three", 3);

	        int value = concurrentMap.get("two");
	        System.out.println("ConcurrentHashMap - Value: " + value);

	        // ConcurrentSkipListMap
	        ConcurrentSkipListMap<String, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();
	        concurrentSkipListMap.put("one", 1);
	        concurrentSkipListMap.put("three", 3);
	        concurrentSkipListMap.put("two", 2);

	        value = concurrentSkipListMap.get("two");
	        System.out.println("ConcurrentSkipListMap - Value: " + value);

	        // CopyOnWriteArrayList
	        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	        list.add("one");
	        list.add("two");
	        list.add("three");

	        String element = list.get(1);
	        System.out.println("CopyOnWriteArrayList - Element: " + element);

	        // CopyOnWriteArraySet
	        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
	        set.add("one");
	        set.add("two");
	        set.add("three");

	        boolean contains = set.contains("two");
	        System.out.println("CopyOnWriteArraySet - Contains 'two': " + contains);

	        // ConcurrentLinkedQueue
	        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
	        queue.offer("one");
	        queue.offer("two");
	        queue.offer("three");

	        String head = queue.poll();
	        System.out.println("ConcurrentLinkedQueue - Head: " + head);

	        // BlockingQueue (ArrayBlockingQueue)
	        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
	        blockingQueue.put("one");
	        blockingQueue.put("two");
	        blockingQueue.put("three");

	        head = blockingQueue.take();
	        System.out.println("BlockingQueue - Head: " + head);

	        // Example with AtomicInteger
	        AtomicInteger atomicInt = new AtomicInteger(0);
	        int newValue = atomicInt.incrementAndGet();
	        System.out.println("AtomicInteger - New Value: " + newValue);
	    }
}

/**
 * 
 * 
 * Certainly! Here's a concise summary of why Java 8 concurrent collections were introduced and the problems they address with legacy collections:

1. **Thread Safety:**
   - **Problem:** Legacy collections are not inherently thread-safe, leading to data races and concurrency issues in multi-threaded applications.
   - **Solution:** Java 8 concurrent collections provide built-in thread safety, allowing safe concurrent read and write operations.

2. **Performance:**
   - **Problem:** Synchronized legacy collections can lead to contention and performance bottlenecks due to all threads contending for the same lock.
   - **Solution:** Java 8 concurrent collections use fine-grained locking and other techniques to reduce contention and improve performance.

3. **Iteration Safety:**
   - **Problem:** Legacy collections may throw `ConcurrentModificationException` or produce inconsistent results when iterated while being modified.
   - **Solution:** Java 8 concurrent collections offer safe and consistent iterators, eliminating such exceptions and inconsistencies.

4. **Memory Visibility:**
   - **Problem:** Legacy collections may not ensure immediate visibility of changes made by one thread to other threads due to memory visibility issues.
   - **Solution:** Java 8 concurrent collections guarantee memory visibility, ensuring changes are immediately visible to other threads.

5. **Blocking Operations:**
   - **Problem:** Legacy collections lack efficient support for blocking operations, making it challenging to implement producer-consumer patterns.
   - **Solution:** Java 8 introduced concurrent collections like `BlockingQueue` with efficient blocking operations for easier thread coordination in such scenarios.

In summary, Java 8 concurrent collections offer thread safety, improved performance, safe iteration, memory visibility guarantees, and support for blocking operations, addressing the limitations 
and challenges of legacy collections in concurrent programming.
 * 
 * 
 */
