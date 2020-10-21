package week8.day1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 陈林
 * @create 2020-09-21  11:03
 */
public class NetTest {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getByName("localhost"));
        System.out.println(InetAddress.getLocalHost());
    }
}
