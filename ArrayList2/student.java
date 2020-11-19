package ArrayList2;

//定义学生类
public class student {

    private String name;
    private String age;

    //构造无参变量
    public student() {
    }

    //构造多个参数变量
    public student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String  getAge() {
        return age;
    }
}
