package ArrayList;

import java.util.ArrayList;

/*
    需求：创建一个存储学生对象的集合，存储三个学生对象，使用程序实现控制台遍历该集合
        1.定义学生类
        2.创建集合对象
        3.创建学生对象
        4.添加学生对象到集合中
        5.遍历集合
 */
public class ArrayList01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<student> arry = new ArrayList<student>();

        //创建学生对象
        student s1 = new student("Amy", 20);
        student s2 = new student("Aix", 21);
        student s3 = new student("Rong", 22);

        //添加学生对象到集合中
        arry.add(s1);
        arry.add(s2);
        arry.add(s3);

        //遍历集合
        for (int i = 0; i < arry.size(); i++){
            student s = arry.get(i);
            System.out.println(s.getName()+'，'+s.getAge());
        }
    }
}
