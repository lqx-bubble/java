package jiekou_cat_dog;

public class Cat extends Animal implements jumping {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("能跳高");
    }
}
