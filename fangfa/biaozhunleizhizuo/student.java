package fangfa.biaozhunleizhizuo;

public class student {
    //成员变量
    private String name;
    private int age;

    //构造无参方法
    public student() {
    }

    //构造带参数方法
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "，" + age);
    }
}
