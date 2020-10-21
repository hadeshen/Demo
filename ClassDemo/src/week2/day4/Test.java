package week2.day4;

/**
 * @author：陈林
 * @date：2020/8/13 9:45
 */
public class Test {
    public static void main(String[] args) {
        Administrator a = new Administrator();
//        Scanner input = new Scanner(System.in);
        a.setLoginAccout("123");
        a.setLoginPassword("123");
//        System.out.println("请输入账号：");
//        String name=input.next();
//        if(name.equals(a.getLoginAccout())){
//            System.out.println("请输入密码：");
//            String password=input.next();
//            if(password.equals(a.getLoginPassword())){
//                System.out.println("登录成功");
//            }else {
//                System.out.println("密码错误");
//            }
//        }else {
//            System.out.println("账户不存在！");
//        }
        a.checkLogin();
    }
}
