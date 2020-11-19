package xianchengtongbu_maipiao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//1.定义一一个类SellTicket实现Runnable接口，里面定义一个成员变量: private int tickets= 100;
public class SellTicket implements Runnable {
    private int tickets = 5000;
    private Object obj = new Object();    //一：同步代码块解决数据安全问题：
    Lock lock = new ReentrantLock();    //二：lock锁解决数据安全问题

    /*
    2.在SellTicket类中重写run(方法实现卖票,代码步骤如下
            A:判断票数大于0,就卖票,并告知是哪个窗口卖的
            B:卖了票之后，总票数要减1
            C:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
     */

    @Override
    public void run() {
        while (true) {
            //一：同步代码块解决数据安全问题：
//            synchronized (obj) {
//                //通过sleep()模拟出票时间
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
//                }
//            }
            //二：lock锁解决数据安全问题
            //通过sleep()模拟出票时间
//            lock.lock();
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (tickets > 0) {
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//            lock.unlock();     //为了避免上面的代码出现问题不能释放锁，所以采用try...finally的方式

            lock.lock();
            try {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();    //无论上面的代码是否出问题，最终都会释放锁
            }
        }
    }
}
