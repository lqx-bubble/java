package chouxainglei;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象
//        Animal a = new Animal();    抽象类不能直接实例化
        Animal a = new Cat();    //抽象类的子类参照多态的方式实例化对象

        a.eat();
        a.sleep();
    }
}
