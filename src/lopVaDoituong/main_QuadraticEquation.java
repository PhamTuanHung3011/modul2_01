package lopVaDoituong;

public class main_QuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation phuongtrinh1 = new QuadraticEquation(1,4,-5);



        phuongtrinh1.setNumber1(1);
        phuongtrinh1.setNumber2(5);
        phuongtrinh1.setNumber3(3);
        System.out.println(phuongtrinh1.getDiscriminant());
        if (phuongtrinh1.getDiscriminant() > 0) {
            System.out.println(phuongtrinh1.nghiemX1());
            System.out.println(phuongtrinh1.nghiemX2());
        } else if (phuongtrinh1.getDiscriminant() == 0) {
            System.out.println(phuongtrinh1.nghiemkep());
        } else {
            System.out.println(" vo nghiem ");
        }
    }
}
