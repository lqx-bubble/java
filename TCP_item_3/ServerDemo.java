package TCP_item_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    接收到的数据写入文本文件
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        //监听
        Socket s = ss.accept();
        //接收
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //数据写入文本
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\25809\\Desktop\\s.txt"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}


















