package TCP_item_5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    接收到的数据写入文本文件，给反馈
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        //监听
        Socket s = ss.accept();
        //接收
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //数据写入文本
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\25809\\Desktop\\s5.txt"));

        String line;
        while ((line=br.readLine())!=null){  //等待读取数据，无法执行给出反馈，需要结束等待
            //结束等待方式一：自定义结束标记
//            if ("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bwserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwserver.write("文件上传成功！");
        bwserver.newLine();
        bwserver.flush();

        bw.close();
        ss.close();
    }
}
