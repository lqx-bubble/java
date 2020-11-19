package xianchengtongbu_maipiao;
/*
    思路:
        1.定义一一个类SellTicket实现Runnable接口，里面定义一个成员变量: private int tickets= 100;
        2.在SellTicket类中重写run(方法实现卖票,代码步骤如下
            A:判断票数大于0,就卖票,并告知是哪个窗口卖的
            B:卖了票之后，总票数要减1
            C:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
        3.定义一个测试类SellTicketDemo,里面有main方法, 代码步骤如下
            A:创建SellTicket类的对象
            B:创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
            C:启动线程
 */
/*
    一：同步代码块解决数据安全问题：把多条语句操作共享数据的代码锁起来，让任意时刻只能有一个线程执行
        格式：synchronized(任意对象){
            多条语句操作共享数据的代码
        }
   好处：解决数据安全问题
    弊端：当线程多时加锁耗费系统资源

    二：lock锁解决数据安全问题
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //A:创建SellTicket类的对象
        SellTicket sell = new SellTicket();
        //B:创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread s1 = new Thread(sell,"窗口1");
        Thread s2 = new Thread(sell,"窗口2");
        Thread s3 = new Thread(sell,"窗口3");

        //C:启动线程
        s1.start();
        s2.start();
        s3.start();

    }
}
