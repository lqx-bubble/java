package jiekouchengyuantedian;

public interface Inter {

    //接口里的成员变量只能是常量，因为默认有public static final修饰
    public int num = 10;
    public final int num2 = 20;

    //public void show(){}          接口里面不能有非抽象方法

    public abstract void show();

    void method();    //默认有   public abstract   修饰
}
