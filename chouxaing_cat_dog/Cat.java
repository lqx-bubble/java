package chouxaing_cat_dog;

public class Cat extends Animal {

    public Cat() {
    }//无参构造方法

    public Cat(String name, int age) {
        super(name, age);
    }//带参构造方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
