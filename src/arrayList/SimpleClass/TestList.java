package arrayList.SimpleClass;

public class TestList {
    public static void main(String[] args) {

        Simple_class<Integer> listInterger = new Simple_class<>();

        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(4);


        System.out.println("element 2" + listInterger.get(1));
    }
}
