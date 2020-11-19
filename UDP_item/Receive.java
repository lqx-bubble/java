package UDP_item;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据：
        因为接收端不知道发送端发送什么时候停止发送，故采用死循环接收
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        //1.创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            //2.创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //3.调用DatagramSocket对象的方法接收数据
            ds.receive(dp);

            //4.解析数据包，并把数据显示在控制台
            System.out.println("发送过来的数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //5.关闭接收端
        //ds.close();

    }
}
