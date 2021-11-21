package stack_queue.linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(5);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(7);
        myLinkedList.add(2,4);
        myLinkedList.printList();


//        LinkedList<Integer> myLinked = new LinkedList<Integer>();
//        myLinked.add(0,1);
//        myLinked.add(1, 3);
//        myLinked.add(2,5);
//        myLinked.add(2,4);
//        myLinked.add(1,2);
//
//        System.out.println(myLinked);
    }
}
