package hashCode;
/*
    哈希值：是JDK根据对象的地址或字符串或数字算出来的int类型的值

    Object类中有一个方法可以获得对象的哈希值
        public int hashCode():  返回对象的哈希码值
*/
public class hashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("Bool",20);

        //同一个对象调用 hashCode() 返回的哈希码值是一样的
        System.out.println(s.hashCode());//2129789493
        System.out.println(s.hashCode());//2129789493

        System.out.println("----------");

        //默认情况下，不同对象的哈希值是不同的
        //通过重写  hashCode()  方法可以使不同对象的哈希值相同    （可在Student类中重写）
        Student ss = new Student("Bool",20);
        System.out.println(ss.hashCode());//668386784

        System.out.println("-----------------------------");
        System.out.println("world".hashCode());//113318802
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802

        System.out.println("-----------------------------");
        System.out.println("重地".hashCode());//
        System.out.println("通话".hashCode());//
    }
}
