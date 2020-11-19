package TCP_item_5;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自文本文件，给反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.32.100",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\25809\\Desktop\\元尊.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //结束等待方式一：自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        //方式二：
        s.shutdownOutput();  //表示输出结束


        //接收反馈
        BufferedReader brclient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brclient.readLine();   //等待读取服务器反馈的数据
        System.out.println("服务器的反馈："+data);

        br.close();
        s.close();
    }
}
