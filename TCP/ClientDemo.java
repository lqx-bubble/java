package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP发送数据的步骤：
        1.创建客户端的Socket对象(Socket)
        2.获取输出流，写数据
        3.释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.创建客户端的Socket对象(Socket)
        //Socket s = new Socket(InetAddress.getByName("192.168.32.100"),10000);
        Socket s = new Socket("192.168.32.100",20000);

        //2.获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("Hello world!".getBytes());

        //3.释放资源
        s.close();

    }
}
