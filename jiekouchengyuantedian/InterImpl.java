package jiekouchengyuantedian;

//public class InterImpl implements Inter {   等价于
public class InterImpl extends Object implements Inter {
    public InterImpl() {
        super();
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}
