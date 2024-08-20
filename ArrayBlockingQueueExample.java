import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);

        // Adding elements to the queue
        blockingQueue.put("First");
        blockingQueue.put("Second");

        // Trying to add another element (will block if capacity is full)
        System.out.println("Attempting to add Third...");
        // blockingQueue.put("Third");

        // Removing elements from the queue
        System.out.println("Removed: " + blockingQueue.take());
        System.out.println("Removed: " + blockingQueue.take());
    }
}
