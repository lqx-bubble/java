package treeset_chengji;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息（姓名、语文成绩、数学成绩），并遍历该集合
    要求：
        按照总分从高到低，总分相同，按语文成绩高到低
    思路：
        1.定义学生类
        2.创建TreeSet集合对象，通过比较器排序进行排序
        3.创建学生对象
        4.把学生对象添加到集合
        5.遍历集合
 */
public class treesetDemo {
    public static void main(String[] args) {

        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照总分从高到低
                //int num = (s2.getChinese()+s2.getMath())-(s1.getChinese()+s1.getMath());
                int num = s2.getSum() - s1.getSum();
                //总分相同，按语文成绩高到低
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                //分数都相同，名字不同时，按照姓名排序
                int num3 = num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("Amy", 89, 87);
        Student s2 = new Student("Alex", 78, 91);
        Student s3 = new Student("Bool", 75, 86);
        Student s4 = new Student("Cole", 79, 78);
        Student s5 = new Student("Gugu", 86, 79);

        Student s6 = new Student("Hilo", 79, 86);  //总分与s5相同

        Student s7 = new Student("Mimi", 86, 79);  //语文数学分数相同，名字不同

        //把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历集合
        for (Student i : ts) {
            System.out.println(i.getName() + "，" + i.getChinese() + "，" + i.getMath() + "，Sum：" + i.getSum());
        }
    }
}
