package xiancheng_02;
/*
    实现多线程方式二：实现Runnable接口
        1.定义一个类MyRunnable实现Runnable接口
        2.在MyRunnable类中重写run()方法
        3.创建MyRunnable类的对象
        4.创建Thread类的对象，把MyRunable对象作为构造方法的参数
        5.启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //3.创建MyRunnable类的对象
        MyRunnable my = new MyRunnable();        //可以把my看成是一个资源，由t1,t2执行

        //4.创建Thread类的对象，把MyRunable对象作为构造方法的参数
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);
        //或者
        Thread t1 = new Thread(my,"飞机");
        Thread t2 = new Thread(my,"高铁");

        //启动线程
        t1.start();
        t2.start();
    }
}
