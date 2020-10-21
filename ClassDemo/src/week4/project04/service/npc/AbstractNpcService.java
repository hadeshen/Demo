package week4.project04.service.npc;


import week4.project04.model.Npc;

/**
 * 可以将具体的npc类共有的部分提取出来
 */
public abstract class AbstractNpcService implements NpcService {
    Npc npc = new Npc();

    @Override
    public void welcome() {

        // 输出npc的名字和台词
        System.out.println(npc.getNpcName() + "：" + npc.getDialogue());

    }
}
