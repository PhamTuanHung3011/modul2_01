package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;

public class MyStack<E> {
    private int size;
    private E[] elements;


    public MyStack() {
        elements = (E[]) new Object[1];
    }
    public void add(E e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements,elements.length*2);
        }
        elements[size] = e;
        size++;
    }
    public void Pop() {
        if (!isEmpty()) {
            E lastElement = elements[size - 1];
            elements[size - 1] = null;
            System.out.println(lastElement);
        }
    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+" \t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        stack1.add(4);
        stack1.add(5);
        stack1.show();
        stack1.Pop();

    }

}
