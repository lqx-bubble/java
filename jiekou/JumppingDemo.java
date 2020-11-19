package jiekou;

public class JumppingDemo {
    public static void main(String[] args) {
        //Jumpping j = new Jumpping();   //接口也是抽象类型，不能直接实例化

        //需要参照多态的方式实现实例化
        Jumpping j = new Cat();
        j.jump();
    }
}
