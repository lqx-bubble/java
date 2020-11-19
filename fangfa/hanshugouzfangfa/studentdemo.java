package fangfa.hanshugouzfangfa;
/*
    测试类
 */
public class studentdemo {
    public static void main(String[] args) {
        //public student()
        student s1 = new student();         //创建对象
        s1.show();

        //public student(String name)
        student s2 = new student("林青霞");            //创建对象
        s2.show();

        //public student(int age)
        student s3 = new student(30);           //创建对象
        s3.show();
        student s5 = new student(130);           //创建对象
        s5.show();

        //public student(String name,int age)
        student s4 = new student("林青霞",30);         //创建对象
        s4.show();
    }
}
