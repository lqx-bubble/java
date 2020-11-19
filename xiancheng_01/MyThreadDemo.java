package xiancheng_01;
/*
    实现多线程方式一：继承Tread类
        1.定义一个类MyThread继承Thread类
        2.在MyThread类中重写run()方法      (因为在MyThread可能有很多代码，为了区分哪些代码需要被线程执行，java封装了run()方法，因此需要重写)
        3.创建MyThread类的对象
        4.启动线程
 */
/*
    Thread类中获取和设置线程名称的方法
        void setName(String name): 将此线程的名称改为 name
        String getName(): 返回此线程的名称
 */
/*
    Thread类中设置和获取线程优先级的方法
        public final void setPriority(int newPriority)：更改此线程的优先级
        public final int getPriority()：返回此线程的优先级
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        //3.创建MyThread类的对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        MyThread my3 = new MyThread();


        my1.setName("飞机");
        my2.setName("高铁");
        my3.setName("汽车");


        //public final int getPriority()：返回此线程的优先级
//        System.out.println(my1.getPriority());
//        System.out.println(my2.getPriority());
//        System.out.println(my3.getPriority());       //默认优先级是5


//        System.out.println(Thread.MAX_PRIORITY);   //最大优先级10
//        System.out.println(Thread.MIN_PRIORITY);    //最小优先级1
//        System.out.println(Thread.NORM_PRIORITY);   //默认5
        //public final void setPriority(int newPriority)：更改此线程的优先级
        my1.setPriority(10);
        my2.setPriority(5);
        my3.setPriority(1);           //优先级高代表获取cpu时间片的几率高


        //4.启动线程
//        my1.run();
//        my2.run();    //线程没有启动

        //void start()启动线程，由java虚拟机调用run() 方法
        my1.start();
        my2.start();
        my3.start();


    }
}
