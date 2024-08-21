Java Queue Interface 
-avail in java.util packages.
-process in FIFO manner

For the declaration queue requires few concrete classes, the most common used are LinkedList & PriorityQueue
Others are: 
LinkedList
import java.util.LinkedList;
PriorityQueue
import java.util.PriorityQueue;
ArrayDeque
import java.util.ArrayDeque;
ConcurrentLinkedQueue
import java.util.concurrent.ConcurrentLinkedQueue;
ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;
LinkedBlockingQueue
import java.util.concurrent.LinkedBlockingQueue;
PriorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;
DelayQueue 
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed; 
import java.util.concurrent.TimeUnit;
SynchronousQueue
import java.util.concurrent.SynchronousQueue; 


Methods: 
// boolean add(obj) : returns true upon success 
// boolean offer(obj) : used to insert 

// Object remove() : used to retrieve & remove the head of the queue 
// Object poll() : used to retrieve & remove the head of the queue 

// Object element() : used to retrieve, but does not remove the head of the queue 
// Object peek() : used to retrieve, but does not remove the head of this queue, or returns null if queue is Empty. 


