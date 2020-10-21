package week4.Exorcist.view;

/**
 * 启动游戏的类
 */
public class Play {
    public void startGame(){
        // 实例化Story，开启一个新故事
        Story story = new Story();
        // 开始游戏
        story.start();
    }
}
