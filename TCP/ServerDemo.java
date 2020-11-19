package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤：
        1.创建服务器端的Socket对像(ServerSocket)
        2.侦听要连接到此套接字并接收它
        3.获取输入流，读数据，并把数据显示在控制台
        4.释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端的Socket对像(ServerSocket)
        ServerSocket ss = new ServerSocket(20000);

        //2.侦听要连接到此套接字并接收它
        Socket s = ss.accept();

        //3.获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("数据是："+data);

        //4.释放资源
        //s.close();
        ss.close();

    }
}
