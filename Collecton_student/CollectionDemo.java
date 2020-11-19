package Collecton_student;

/*
    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        思路：
            1.定义学生类
            2.创建Collection集合对象
            3.创建学生对象
            4.把学生添加到集合
            5.遍历集合（迭代器方式）
 */

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        //创建Collection集合对象
        ArrayList<Student> c = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("Amy", 20);
        Student s2 = new Student("Alex",35);
        Student s3 = new Student("Bool",25);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历集合（迭代器方式）
        Iterator<Student> i = c.iterator();
        while (i.hasNext()){
            Student s = i.next();
            System.out.println(s.getName()+"，"+s.getAge());
        }
    }
}
