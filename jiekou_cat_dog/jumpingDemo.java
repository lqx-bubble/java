package jiekou_cat_dog;

import java.net.JarURLConnection;

/*
    测试类
 */
public class jumpingDemo {
    public static void main(String[] args) {
        //创建对象、调用无参方法
        Animal c = new Cat();
        c.setName("加菲");
        c.setAge(2);
        System.out.println(c.getName() + "，" + c.getAge());
        c.eat();
        jumping cc = new Cat();
        cc.jump();
        System.out.println("--------");

        Animal d = new Dog();
        d.setName("金毛");
        d.setAge(3);
        System.out.println(d.getName() + "，" + d.getAge());
        d.eat();
        jumping dd = new Dog();
        dd.jump();
        System.out.println("--------");

        //创建对象、调用带参方法
        Animal c1 = new Cat("布偶", 3);
        System.out.println(c1.getName() + "，" + c1.getAge());
        c1.eat();
        jumping cc1 = new Cat();
        cc1.jump();
        System.out.println("--------");

        Animal d1 = new Dog("二哈", 5);
        System.out.println(d1.getName() + "，" + d1.getAge());
        d1.eat();
        jumping dd1 = new Dog();
        dd1.jump();

        System.out.println("---------------------");


        //或者    可以使用同一个对象ccc调用两个方法
        Cat ccc = new Cat();
        ccc.setName("加菲");
        ccc.setAge(2);
        System.out.println(ccc.getName() + "，" + ccc.getAge());
        ccc.eat();
        ccc.jump();
    }
}
