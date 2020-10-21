package week8.day3;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-23  16:04
 * 网络聊天功能
 * 1)用网络编程编写一个服务端
 * 2)用网络编写一个客户端
 * 3)客户端输入client，服务端响应I'SERVER!
 */
public class Test2 {
    @Test
    public void server() throws Exception {
        //创建服务 并指明端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //监听消息
        Socket accept = serverSocket.accept();
        //获取输入流
        InputStream is = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String message = br.readLine();
        System.out.println("收到来自："+accept.getInetAddress().getHostAddress()+"的消息");
        System.out.println(message);
        //关闭输入流
        accept.shutdownInput();
        OutputStream os = accept.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        if ("client".equals(message)){
            bw.write("I'SERVER!");
            bw.flush();
        }else {
            bw.write(message+"不在线");
            bw.flush();
        }
        bw.close();
        serverSocket.close();


    }

    @Test
    public void client() throws Exception {

        System.out.println("你找谁？");
        Scanner input = new Scanner(System.in);
        //创建服务
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String sendMessage = input.next();
        //创建输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write(sendMessage);
        bw.flush();
//        os.write(sendMessage.getBytes());
        //关闭输入流
        socket.shutdownOutput();
        //获取输入流
        InputStream is = socket.getInputStream();
        //创建缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String receiveMessage = br.readLine();
        System.out.println(receiveMessage);
        br.close();
        bw.close();
        socket.close();

    }
}
