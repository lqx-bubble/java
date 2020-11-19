package Visitor;

import java.util.Scanner;

public class InitialVistor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        visitor v = new visitor();      //创建对象
        //属性赋值
        System.out.print("请输入姓名：");
        v.name = input.next();
        System.out.print("请输入年龄：");
        v.age = input.nextInt();

        v.show();       //调用方法
    }
}
