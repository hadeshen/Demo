package week3.project03;

import static week3.project03.Constant.COMPUTER_NAME;

/**
 * @author ytt
 * 电脑玩家
 */
public class Computer extends GamePlayer {


    @Override
    public int getInputValue() {
        setValue(RandomUtil.getRandomNumber());
        return getValue();
    }
}
