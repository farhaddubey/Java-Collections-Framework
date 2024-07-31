boolean add(object) : used to insert specified element into this deque 
boolean offer(object) : used to insert specified element into this deque
Object remove(): used to retrieve & remove the head of this deque
Object poll(): used to retrieve & remoove the head of this deque
Object element(): used to retrieve, but does not remove the head of this deque 
Object peek(): used to retrieve, but does not remove, the head of this deque, or returns null if this deque is 
                empty
Object peekFirst(): returns the head element of this deque. Null returned if this deque is empty.
Boolean offerFirst(e): Inserts the element e at the front of the queue. It the insertion is successful, true is 
returned, otherwise false.
Boolean offerLast(e): Inserts the element e at the tail of the queue. If insertion is successful, true returned. 
Important Points about ArrayDeque: 
1. In ArrayDeque insertion and deletion possible from both the sides. 
2. Null elements are not allowed in the ArrayDeque.
3. ArrayDeque is not thread safe, in the absence of external synchronisation. 
4. ArrayDeque has no capacity restrictions.
5. ArrayDeque is faster than LinkedList & Stack. 

