package duotai_zhuanxing;
/*
    向上转型
        从父到子
        父类引用指向子类对象

    向下转型
        从父到子
        父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();       //父类引用指向子类对象
        a.eat();
        //a.playgame();   //不能使用子类特有对象


        //向下转型
        Cat c = (Cat)a;     //父类引用转为子类对象
        c.eat();
        c.palygame();   //可以使用子类特有对象
    }
}
