package duotai;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Cat c = new Cat();
        Dog d = new Dog();
        Pig p = new Pig();

        ao.useAnimal(c);
        ao.useAnimal(d);
        ao.useAnimal(p);

    }
}
