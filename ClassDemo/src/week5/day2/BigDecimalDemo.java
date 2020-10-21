package week5.day2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

/**
 * @author：陈林
 * @date：2020/9/3 9:47
 * 创建BigDecimalDemo类，在类中分别定义add(),sub(),mul()和div()方法实现加、减、乘、除运算，
 * 并输出运算结果。要求除法，可以处理商的精度。
 */
public class BigDecimalDemo {


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(123456789);
        BigDecimal b= new BigDecimal(123);
        System.out.println(a.divide(b,13, BigDecimal.ROUND_HALF_DOWN));
    }
}
