package week3.project03;

import java.util.Scanner;

/**
 * @author ytt
 * 游戏核心功能类
 */
public class MyGame {
    //系统输入
    private Scanner input = new Scanner(System.in);
    //当前玩家
    private Player player = new Player();
    //电脑玩家
    private Computer computer = new Computer();
    //回合数
    private int count = 1;

    /**
     * 游戏初始化，对玩家及电脑进行初始化
     * 初始化玩家跟电脑的胜利场数为0
     */
    public void initGame() {
        player.setVictoryCount(0);
        computer.setVictoryCount(0);
        System.out.println("游戏开始");
        System.out.println("请输入玩家姓名：");
        //玩家输入姓名
        String name = input.next();
        player.setName(name);
        //电脑玩家随机生成
        computer.setName(Constant.COMPUTER_NAME[RandomUtil.getRandomNumber()]);
        System.out.println("电脑玩家为：" + computer.getName());
    }

    /**
     * 开始游戏
     */
    public void startGame() {


        System.out.println("========================");
        System.out.println("第" + count + "回合开始");
        System.out.println("请出拳：0、石头，1、剪刀，2、布");

        int result = compare(player.getInputValue(), computer.getInputValue());
        player.show();
        computer.show();
        updateVictoryCount(result);
        showResultInfo(result);
        endGame();
    }

    /**
     * 出拳规则比较
     *
     * @param playerValue
     * @param computerValue
     * @return 0
     */
    public int compare(int playerValue, int computerValue) {
        //当玩家与电脑出拳一致时，返回0，表示平局
        if (playerValue == computerValue) {
            return 0;
        }
        //当玩家出拳为石头
        else if (playerValue == Constant.STONE) {
            //电脑出拳为剪刀
            if (computerValue == Constant.SCISSORS) {
                //返回1，表示玩家胜利
                return 1;
            } else {
                //否则返回-1，表示电脑出拳为布，玩家失败
                return -1;
            }

        }
        //当玩家出拳为剪刀
        else if (playerValue == Constant.SCISSORS) {
            //电脑出拳为石头
            if (computerValue == Constant.STONE) {
                //返回-1，，玩家失败
                return -1;
            } else {
                //返回1，玩家胜利
                return 1;
            }

        }
        //当玩家出布
        else {
            //电脑出石头时
            if (computerValue == Constant.STONE) {
                //返回1，玩家胜利
                return 1;
            } else {
                //返回-1，玩家失败
                return -1;
            }
        }
    }

    /**
     * 根据出拳结果，修改玩家或电脑胜场数
     *
     * @param result
     */
    private void updateVictoryCount(int result) {
        if (result == 1) {
            System.out.println("本局：玩家赢");
            player.setVictoryCount(player.getVictoryCount() + 1);
        } else if (result == 0) {
            System.out.println("本局：平局");

        } else if (result == -1){
            System.out.println("本局：电脑赢");
            computer.setVictoryCount(computer.getVictoryCount()+1);
    }

}

    /**
     * 根据出拳结果，打印输出最后的结果及比分
     *
     * @param result
     */
    private void showResultInfo(int result) {
        System.out.println("当前比分：" + player.getName() + " vs " + computer.getName() + " "
                + player.getVictoryCount() + " vs " + computer.getVictoryCount());
        count++;
    }

    /**
     * 游戏结束
     */
    public void endGame() {
        if (player.isVictory()) {
            System.out.println(player.getName() + "胜利");

        } else if (computer.isVictory()) {
            System.out.println(computer.getName() + "胜利");

        } else {
            startGame();
        }
    }
}
