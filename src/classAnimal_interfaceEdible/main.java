package classAnimal_interfaceEdible;


public class main {
    public static void main(String[] args) {
        animal_class[] dongvat = new animal_class[2];
        dongvat[0] = new Tiger_class();
        dongvat[1] = new Chicken_class();

        for (animal_class dv : dongvat) {
            dv.makeSound();
            System.out.println(dv.makeSound());

            if (dv instanceof Chicken_class) {
                edible edible1 = (Chicken_class) dv;
                System.out.println(edible1.howtoEat());
            }
        }

        fruit_class[] hoaqua = new fruit_class[2];
        hoaqua[0] = new Apple();
        hoaqua[1] = new Orange_class();

        for (fruit_class hq : hoaqua) {
            System.out.println(hq.howtoEat());
        }
    }

}
