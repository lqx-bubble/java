package Visitor;

import java.util.Scanner;

public class visitor {
    String name;   //游客姓名
    int age;   //年龄

    //  用于输出的方法
    public void show(){
        Scanner input = new Scanner(System.in);
        while (!"n".equals(name)){
            if(age>=18 && age<=60){
                System.out.println(name+"年龄为："+age+"，价格为20元");
                break;
            }else {
                System.out.println(name+"的年龄为："+age+"，免费");
                break;
            }
        }
    }
}




