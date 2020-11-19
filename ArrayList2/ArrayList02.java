package ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：创建一个存储学生对象的集合，存储三个学生对象，使用程序实现控制台遍历该集合
        1.定义学生类（为了方便录入，把变量都设为String类型）
        2.创建集合对象
        3.创建键盘录入对象所需要的数据
        4.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        5.添加学生对象到集合中
        6.遍历集合
 */
public class ArrayList02 {
    //方法一：循环
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<student> array = new ArrayList<student>();
//
//        for (int i = 0;i<3;i++) {
//            //创建键盘录入对象所需要的数据
//            Scanner input = new Scanner(System.in);
//            System.out.print("请输入第"+i+1+"个学生的姓名：");
//            String name = input.nextLine();
//            System.out.print("请输入第"+i+1+"个学生的年龄：");
//            String age = input.nextLine();
//
//            //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//            student s = new student();
//            s.setName(name);
//            s.setAge(age);
//
//            //添加学生对象到集合中
//            array.add(s);
//        }
//
//        //遍历集合
//        for (int j = 0; j < array.size(); j++){
//            student s = array.get(j);
//            System.out.println(s.getName()+'，'+s.getAge());
//        }

        //调三次方法
        addstudent(array);
        addstudent(array);
        addstudent(array);

        //遍历集合
        for (int j = 0; j < array.size(); j++){
            student s = array.get(j);
            System.out.println(s.getName()+'，'+s.getAge());
        }

    }
    public static void addstudent(ArrayList<student> array){

        //创建键盘录入对象所需要的数据
        Scanner input = new Scanner(System.in);

        System.out.print("请输入学生的姓名：");
        String name = input.nextLine();
        System.out.print("请输入学生的年龄：");
        String age = input.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        student s = new student();
        s.setName(name);
        s.setAge(age);

        //添加学生对象到集合中
        array.add(s);

    }
}
