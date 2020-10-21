package week3.project03;

import java.util.Random;

/**
 * @author ytt
 * 随机数工具类
 */
public class RandomUtil {
    public static int getRandomNumber() {
        return new Random().nextInt(Constant.CLOTH + 1);
    }
}
