package week4.Exorcist.service.npc;


import week4.Exorcist.model.Player;

public interface NpcService {
    /**
    * 当玩家访问时打招呼并自我介绍
    */
    void welcome();

    /**
     * 对玩家提供相应的帮助
     *
     * @param player
     *            访问NPC的玩家
     */
    void helpPlayer(Player player);

}
