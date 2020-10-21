package week5.day5;

/**
 * @author：陈林
 * @date：2020/9/4 9:57
 * 查找字符串中的大写字母、小写字母、非英文字母出现的次数并输出
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "adfkj123)dJISJfjs(oSJOF23AKOffs#$!";
        for (int i = 0; i < str.length(); i++) {
            //大写字母
//            if (Character.isUpperCase(str.charAt(i))){
//                System.out.print(str.charAt(i));
//            }
            //小写字母
//            if (Character.isLowerCase(str.charAt(i))){
//                System.out.print(str.charAt(i));
//            }

            //非英文字母

            if (!Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }

    }
}
