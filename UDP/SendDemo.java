package UDP;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤：
        1.创建发送端的Socked对象(DatagramSocket)
        2.创建数据，并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socked对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //2.创建数据，并把数据打包
        byte[] bys = "Hello,world!".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.32.100");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.32.100"), 10086);

        //3.调用DatagramSocket对象的方法发送数据
        ds.send(dp);

        //4.关闭发送端
        ds.close();
    }
}

























