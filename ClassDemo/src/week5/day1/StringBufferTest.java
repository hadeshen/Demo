package week5.day1;

/**
 * @author：陈林
 * @date：2020/9/1 8:56
 */
public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        //StringBuffer增
        sb1.append(666);
//        sb1.delete(0,2);//删
//        sb1.setCharAt(1,'2');//改
//        sb1.reverse();//逆序
//        sb1.substring(0,3);//查询
//        sb1.insert(1,"giao");//插入
        System.out.println(sb1);
    }
}
