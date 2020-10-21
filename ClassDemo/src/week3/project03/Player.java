package week3.project03;

import java.util.Scanner;

/**
 * 玩家类
 */
public class Player extends GamePlayer {

    /**
     * 重写父类方法
     *
     * @return getInputValue
     */
    @Override
    public int getInputValue() {
        Scanner input = new Scanner(System.in);
        //玩家输入数字
        int playerValue = input.nextInt();
        if (playerValue == 0 || playerValue == 1 || playerValue == 2) {
            setValue(playerValue);
        } else {
            System.out.println("输入错误请重新输入");
            getInputValue();
        }
        return getValue();
    }
}
