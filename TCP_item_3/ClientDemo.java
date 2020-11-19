package TCP_item_3;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于键盘录入对象，直到输入的数据是886，发送结束
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.32.100", 5000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);  //一次写一行
            bw.newLine();   //换行
            bw.flush();     //刷新

        }
        s.close();
    }
}

