package week8.day3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author chenlin
 * @create 2020-09-24  9:24
 */
public class Server {
    public static boolean isUser(String name,String password){
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("风清扬","123");
        userMap.put("逍遥子","123");
        Set<String> keySet = userMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String name1 = iterator.next();
            if (name1.equals(name)){
                if (userMap.get(name1).equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

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

        String password = br.readLine();
        accept.shutdownInput();

        String message = "";
        if (isUser(name,password)){
            message = "登录成功！";
        }else {
            message = "登录失败，账号或者密码错误！";
        }
        OutputStream os = accept.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write(message);
        bw.flush();
        bw.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws Exception {
        Server server1 = new Server();
        server1.server();
    }
}
