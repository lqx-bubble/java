package treeset_student_daican;

import java.util.Comparator;
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建结合使用带参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母排序
 */
public class treesetDemo {
    public static void main(String[] args) {
        //创建对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this.age - s.age == s1.getAge() - s2.getAge()
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //创建学生对象
        Student s1 = new Student("xishi", 27);
        Student s2 = new Student("yangyuhuan", 24);
        Student s3 = new Student("diaochan", 26);
        Student s4 = new Student("wangzhaojun", 23);

        Student s5 = new Student("Bool",27);  //年龄相同时，按照姓名的字母排序

        //学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历
        for (Student i : ts) {
            System.out.println(i.getName() + "，" + i.getAge());
        }

    }
}
