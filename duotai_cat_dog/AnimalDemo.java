package duotai_cat_dog;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal a = new Cat();

        //无参调用
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        //带参调用
        a = new Cat("布偶",3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Animal d = new Dog();

        //无参调用
        d.setName("西米");
        d.setAge(4);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

        //带参调用
        d = new Dog("蛋黄",1);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
