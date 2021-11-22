package Map_Tree.thuchanhComparable_Comparator;

import java.util.*;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       if (o1.getAge() > o2.getAge()) {
           return 1;
       }
       else if (o1.getAge() < o2.getAge()) {
           return -1;
       }
       else {
           return 0;
       }
    }

    public static void main(String[] args) {
        List<Student> lists = new ArrayList<Student>();
        Student student1 = new Student("Thang", 27,"ha noi");
        Student student2 = new Student("Tu Anh",22,"Quang Ninh");
        Student student3 = new Student("Du", 24,"Ha noi");

        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st: lists) {
            System.out.println(st.toString());
        }
        System.out.println("-----Comparator------");
        AgeComparator ageComparator= new AgeComparator();
        Collections.sort(lists, ageComparator);
        for (Student st: lists) {
            System.out.println(st.toString());
        }

    }

}
