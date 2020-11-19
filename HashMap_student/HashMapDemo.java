package HashMap_student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储键值对，并遍历
    思路：
        1.定义学生类
        2.创建HashMap集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合
            1.键找值
            2.键值对对象找键和值
        6.在学生类中重写两个方法（自动生成），确保唯一性（认为性别年龄相同则为同一对象）
            HashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //2.创建HashMap集合对象
        HashMap<Student, String> st = new HashMap<Student, String>();

        //3.创建学生对象
        Student s1 = new Student("Alex", 20);
        Student s2 = new Student("Bool", 25);
        Student s3 = new Student("Colo", 30);

        Student s4 = new Student("Colo", 30);//在学生类中重写了两个方法，无法插入

        //4.把学生添加到集合
        st.put(s1, "西安");
        st.put(s2, "上海");
        st.put(s3, "重庆");
        st.put(s4, "北京");

        //5.遍历集合
        //方式一：键找值
        Set<Student> strings = st.keySet();
        for (Student key : strings) {
            String value = st.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
        System.out.println("------");

        //方式二：键值对对象找键和值
        Set<Map.Entry<Student, String>> entries1 = st.entrySet();
        for (Map.Entry<Student, String> keys : entries1) {
            Student key1 = keys.getKey();
            String value1 = keys.getValue();
            System.out.println(key1.getName() + "," + key1.getAge() + "," + value1);
        }
    }
}
