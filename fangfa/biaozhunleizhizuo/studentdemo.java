package fangfa.biaozhunleizhizuo;

public class studentdemo {
    public static void main(String[] args) {
        //使用无参方法创建对象
        student s1 = new student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();

        //使用带多个参数方法创建对象
        student s2 = new student("张曼玉",28);
        s2.show();
    }
}
