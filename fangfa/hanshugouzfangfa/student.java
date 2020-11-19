package fangfa.hanshugouzfangfa;
/*
    学生类
 */
public class student {
    private String name;
    private int age;

    //无参构造方法
    public student(){}

    //单个参数构造方法
    public student(String name){
        this.name = name;
    }
    public student(int age){
//        this.age = age;
        if (age < 0 || age > 120){
            System.out.println("输入年龄有误");
        }else {
            this.age = age;
        }
    }

    //多个参数构造方法
    public student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+"，"+age);
    }
}

