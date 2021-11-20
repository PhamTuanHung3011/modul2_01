package stack_queue;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("hello anh em");
        System.out.println(stack.size());
        stack.push("hello anh em 2");
        stack.push("hello anh em 3");
        stack.push("hello anh em 4");
        stack.push("hello anh em 5");
        System.out.println(stack.size());
        if (!stack.isEmpty()) {
            System.out.println("xoa bo phan tu da bi pop() " + stack.pop());
        }

        System.out.println("so phan tu con lai sau khi pop(): " + stack.size());

    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.push(0);
        System.out.println("2.1:  Size of stack affter push operations " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("xoa phan tu dau tien: " + stack.pop());
        }
        System.out.println("hien thi lai: "+ stack.size());

    }


    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("2. Stack of String");
        stackOfIStrings();
    }

}
