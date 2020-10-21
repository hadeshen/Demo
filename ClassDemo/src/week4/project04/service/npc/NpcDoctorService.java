package week4.project04.service.npc;


import week4.project04.data.NpcData;
import week4.project04.model.Player;

/**
 * 包含回复导师npc的具有的方法
 */
public class NpcDoctorService extends AbstractNpcService {
    /**
     * 构造方法，在实例化医师npc时生效
     */
    public NpcDoctorService() {
        // 给从父类继承的npc对象进行赋值
        this.npc = NpcData.npcDoctor;

    }

    /**
     * 支付金币进行治疗
     *加血一次金币减1000快，血量加20
     * @param player
     */
    @Override
    public void helpPlayer(Player player) {
        //判断player金币是否够治疗费用
        if (player.getMoney()<1000){
            System.out.println("金币不足");
        }else {
            //判断player血量是否为满血
            if (player.getHp()==player.getMaxHp()){
                System.out.println("满血不需要治疗");
            }else{
                //player金币减1000，血量加20
                player.setMoney(player.getMoney()-1000);
                player.setHp(player.getHp()+20);
                System.out.println("治疗成功，血量恢复20，消耗金币100，血量为："+player.getHp());
            }
        }

    }
}

