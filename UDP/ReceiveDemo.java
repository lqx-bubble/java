package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据的步骤：
        1.创建接收端的Socket对象(DatagramSocket)
        2.创建一个数据包，用于接收数据
        3.调用DatagramSocket对象的方法接收数据
        4.解析数据包，并把数据显示在控制台
        5.关闭接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1.创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);

        //2.创建一个数据包，用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //3.调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //4.解析数据包，并把数据显示在控制台
        byte[] datas = dp.getData();
        //获取接收到的数据的长度
        int len = datas.length;
        String datastring = new String(datas,0,len);
        System.out.println("发送过来的数据是："+datastring);

        //5.关闭接收端
        ds.close();
    }
}















