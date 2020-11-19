package TCP_item_4;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自文本文件
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
        br.close();
        s.close();
    }
}



















