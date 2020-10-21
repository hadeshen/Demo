package week8.day3;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-23  16:03
 * 编写一个服务器和一个客户端
 * 1)服务器上保存了几个用户名和对应的密码;且能验证客户端发送过来的用户名和密码,
 * 是否和保存的某个用户名和对应的密码一致.
 * 2)客户端能连接到服务器，并把用户在键盘上输入的用户名和密码，发送到服务器上
 */
public class Test1 {
    @Test
    public void server() throws Exception {

        //创建服务端
        ServerSocket serverSocket = new ServerSocket(8888);
        //开启消息监听
        Socket accept = serverSocket.accept();
        InetAddress inetAddress = accept.getInetAddress();
        //获取消息的ip
        String hostAddress = inetAddress.getHostAddress();
        InputStream is = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String name = br.readLine();
        br.wait();
        String password = br.readLine();
        accept.shutdownInput();
        String message = "";




    }
    @Test
    public void client() throws Exception {

        //获取IP
        InetAddress localhost = InetAddress.getByName("localhost");
        //创建Socket 并指明服务端口
        Socket socket = new Socket(localhost, 8888);
        //创建输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        System.out.println("请输入用户名：");
        Scanner input = new Scanner(System.in);
        bw.write(input.next());
        bw.flush();
        System.out.println("请输入密码：");
        bw.write(input.next());
        bw.notifyAll();
        bw.flush();
        socket.shutdownOutput();

    }
}
