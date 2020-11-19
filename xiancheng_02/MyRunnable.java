package xiancheng_02;

public class MyRunnable implements Runnable {//1.定义一个类MyRunnable实现Runnable接口
    //2.在MyRunnable类中重写run()方法
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            //Runnable接口不能调用Thread的getName()方法，需要先用Thread.currentThread()拿到当前执行的线程，再拿名字
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
