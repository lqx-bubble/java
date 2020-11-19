package chouxaing_cat_dog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("加菲");
        c.setAge(2);
        System.out.println(c.getName()+"，"+c.getAge());
        c.eat();

        Animal cc = new Cat("布偶",3);
        System.out.println(cc.getName()+"，"+cc.getAge());
        cc.eat();

        Animal d = new Dog();
        d.setName("金毛");
        d.setAge(3);
        System.out.println(d.getName()+"，"+d.getAge());
        d.eat();

        Animal dd = new Dog("二哈",2);
        System.out.println(dd.getName()+"，"+dd.getAge());
        dd.eat();
    }
}
