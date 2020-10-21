package week8.day3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-24  9:41
 */
public class Client {
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
        bw.write("\n");
        bw.flush();
        System.out.println("请输入密码：");
        bw.write(input.next());

        bw.flush();
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        System.out.println(br.readLine());
        br.close();
        socket.close();
    }

    public static void main(String[] args) throws Exception {
        Client client2 = new Client();
        client2.client();
    }
}
