package week4.project04.service.npc;


import week4.project04.data.NpcData;
import week4.project04.data.SkillData;
import week4.project04.model.Player;
import week4.project04.util.ScannerUtil;


/**
 * 包含技能导师npc具有的方法
 */
public class NpcMasterService extends AbstractNpcService {
    /**
     * 构造方法，在实例化技能导师npc时生效
     */
    public NpcMasterService() {

        // 给从父类继承的npc对象进行赋值
        this.npc = NpcData.npcMaster;

    }

    /**
     * 支付金币学习技能
     *
     * @param player
     */
    @Override
    public void helpPlayer(Player player) {
        if ("剑客".equals(player.getProfession().getProfessionName())) {
            System.out.println("1.御剑术");
            System.out.println("2.万剑诀");
            switch (ScannerUtil.scanner.nextInt()) {
                case 1:
                    if (player.getMoney() < 5000) {
                        System.out.println("金币不足");
                    } else {
                        player.setSkills(SkillData.swordmanSkills);
                        player.setMoney(player.getMoney() - 5000);
                        System.out.println("学习技能：御剑术成功");
                    }

                    break;
                case 2:
                    if (player.getMoney() < 50000) {
                        System.out.println("金币不足");
                    } else {
                        player.setSkills(SkillData.swordmanSkills);
                        player.setMoney(player.getMoney() - 50000);
                        System.out.println("学习技能：万剑诀成功");
                    }

                    break;
                default:
                    System.out.println("输入错误");
            }

        } else if ("术士".equals(player.getProfession().getProfessionName())) {
            System.out.println("1.火球术");
            System.out.println("2.烈火流星");
            switch (ScannerUtil.scanner.nextInt()) {
                case 1:
                    if (player.getMoney() < 5000) {
                        System.out.println("金币不足");
                    } else {
                        player.setSkills(SkillData.warlockSkills);
                        player.setMoney(player.getMoney() - 5000);
                        System.out.println("学习技能：火球术成功");
                    }

                    break;
                case 2:
                    if (player.getMoney() < 50000) {
                        System.out.println("金币不足");
                    } else {
                        player.setSkills(SkillData.swordmanSkills);
                        player.setMoney(player.getMoney() - 50000);
                        System.out.println("学习技能：烈火流星成功");
                    }

                    break;
                default:
                    System.out.println("输入错误");

            }
        }
    }
}

