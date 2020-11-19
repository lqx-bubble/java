package chouxainglei;

public class Cat extends Animal {  //继承自抽象类，重写抽象类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
