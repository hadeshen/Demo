package week2.day4;

import java.util.Scanner;

/**
 * @author：陈林
 * @date：2020/8/13 11:42
 */
public class Administrator {
    private String loginAccout;
    private String loginPassword;

    public String getLoginAccout() {
        return loginAccout;
    }

    public void setLoginAccout(String loginAccout) {
        this.loginAccout = loginAccout;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
    public void checkLogin(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号：");
        String name=input.next();
        if(name.equals(getLoginAccout())){
            System.out.println("请输入密码：");
            String password=input.next();
            if(password.equals(getLoginPassword())){
                System.out.println("登录成功");
            }else {
                System.out.println("密码错误");
            }
        }else {
            System.out.println("账户不存在！");
        }
    }
}
