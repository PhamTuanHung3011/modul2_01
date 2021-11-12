package classAnimal_interfaceEdible;

public class Chicken_class extends animal_class implements edible {


    @Override
    public String makeSound() {
        return "chicken: cục tác, cục tác";
    }

    @Override
    public String howtoEat() {
        return "ga nau dong";
    }
}
