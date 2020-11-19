package jiekou_cat_dog;

public class Dog extends Animal implements jumping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("能跳高");
    }
}
