package week8.day1;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenlin
 * @create 2020-09-21  14:19
 */
public class TcpTest {
    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //获取IP
        InetAddress localHost = InetAddress.getByName("localhost");
        //创建服务 指明端口号
        Socket socket = new Socket(localHost, 8888);
        //输出流
        OutputStream os = socket.getOutputStream();
        os.write("一给窝里giao".getBytes());
        //关闭资源
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        //创建服务端
        ServerSocket serverSocket = new ServerSocket(8888);
        //监听来自服务端的消息
        Socket socket = serverSocket.accept();
        //获取输入流
        InputStream is = socket.getInputStream();
//        byte[] bytes = new byte[20];
//        int len;
//        while ((len = is.read(bytes)) != -1){
//            String str = new String(bytes,0,len);
//            System.out.println(str);
//        }
        //读取输入流中的数据
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bytes = new byte[20];
        int len;
        while ((len = is.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        System.out.println(bos.toString());
        //关闭资源
        bos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
