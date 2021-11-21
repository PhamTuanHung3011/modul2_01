package stack_queue.daonguocphantu;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Queue_main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("Nhap chuoi ki tu");
        String inPutChart = scanner.nextLine();

        for (int i = 0; i < inPutChart.length(); i++) {
            stack.push(inPutChart.charAt(i)+"");
        }
        System.out.println("chuoi da dao nguoc");
        for (int i = 0; i < inPutChart.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
