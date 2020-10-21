package week4.Exorcist.service.npc;



import week4.Exorcist.data.NpcData;
import week4.Exorcist.data.ProfessionData;
import week4.Exorcist.model.Player;
import week4.Exorcist.model.Profession;
import week4.Exorcist.model.Skill;
import week4.Exorcist.util.ScannerUtil;

import java.util.LinkedList;
import java.util.List;

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
        //循环判定当前角色的职业
        //1.提取角色的职业信息
        String playerPfName = player.getProfession().getProfessionName();
        Profession profession = new Profession();//存储对应职业
        //2.找到对应的职业
        for (int i = 0; i < ProfessionData.professions.length; i++) {
            //1.1.提取职业名称
            String professionName = ProfessionData.professions[i].getProfessionName();
            //1.2.找到符合的职业
            if (playerPfName.equals(professionName)) {
                profession = ProfessionData.professions[i];
                break;
            }
        }
        //3.打印技能表
        for (int j = 0; j < profession.getSkills().size(); j++) {
            System.out.println((j+1) + "." + profession.getSkills().get(j).getSkillName());
            System.out.println("技能加成："+profession.getSkills().get(j).getSkillInstruction());
        }
        //4.输入学习技能的编号
        int chose = ScannerUtil.scanner.nextInt();
        //5.学习新的技能
        if (player.getMoney() >= profession.getSkills().get(chose-1).getSkillMoney()) {
            List<Skill> skill = new LinkedList<>();
            skill.add(profession.getSkills().get(chose-1));
            System.out.println("恭喜你学的新技能" + profession.getSkills().get(chose-1).getSkillName());
            System.out.println("金币-"+profession.getSkills().get(chose-1).getSkillMoney());
            player.setSkills(skill);
        }

    }
}

