package stack_queue.LinkedListQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(3);
        myLinkedListQueue.enqueue(5);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.dequeue();
        System.out.println(myLinkedListQueue.dequeue().key);

        Queue<Object> queue1 = new LinkedList<>();
        queue1.add("hello");
        queue1.add(3);
        queue1.peek();
        System.out.println(queue1);
    }


}
