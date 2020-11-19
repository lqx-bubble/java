package treeset_student_wucan;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
//        return 0;  //说明元素是重复的，只能存储第一个元素
//        return 1;  //说明第二个元素比第一个元素大，所以按照添加顺序存储
//        return -1;  //与1相反
        //按照年龄大小存储（降序）
//        int num = s.age - this.age;
//        return num;
        //按照年龄大小存储（升序）
        int num = this.age - s.age;      //当不同对象年龄相同时不能成功存储，因为 num = 0 所以
        //年龄相同时，按照姓名的字母排序
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}
