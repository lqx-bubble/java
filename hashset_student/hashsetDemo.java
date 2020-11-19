package hashset_student;

import java.util.HashMap;
import java.util.HashSet;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    要求：
        学生对象的成员变量值相同，我们就认为是同一个对象
    思路：
        1.定义学生类
        2.创建HashSet集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合（增强for）
        6.在Student中重写equals(Object o)  和  hashCode()  方法（自动生成）
 */
public class hashsetDemo {
    public static void main(String[] args) {

        //创建HashSet集合对象
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象
        Student s1 = new Student("Amy", 20);
        Student s2 = new Student("Alex", 23);
        Student s3 = new Student("Bool", 25);

        //学生对象的成员变量值相同，我们就认为是同一个对象
        //需要在Student里重写equals(Object o)  和  hashCode()  方法，确保唯一性
        Student s4 = new Student("Bool", 25);

        //把学生添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合（增强for）
        for (Student i : hs) {
            System.out.println(i.getName() + "，" + i.getAge());
        }
    }
}
