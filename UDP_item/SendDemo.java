package UDP_item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
    UDP发送数据：
        数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socked对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null){
            //输入的数据是886，发送数据结束
            if ("886".equals(line)){
                break;
            }

            //2.创建数据，并把数据打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.32.100"),12345);

            //3.调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }

        //4.关闭发送端
        ds.close();
    }
}












