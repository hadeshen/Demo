package week4.Exorcist.data;



import week4.Exorcist.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class SkillData {
    /**
     * 术士职业可学习的技能
     */
    public static List<Skill> warlockSkills = new ArrayList<Skill>();

    /**
     * 剑客职业可学习的技能
     */
    public static List<Skill> swordmanSkills = new ArrayList<Skill>();
    public static List<Skill> shooterSkills = new ArrayList<Skill>();

    static {

        // 技能：火球术
        Skill warlockSkill1 = new Skill();
        warlockSkill1.setSkillName("火球术");
        warlockSkill1.setSkillMoney(5000);
        warlockSkill1.setAttackAddition(2);
        warlockSkill1.setMana(5);
        warlockSkill1.setSkillInstruction("借自然之力凝聚火球杀伤敌人，造成攻击力2倍的伤害");
        // 技能：烈火流星
        Skill warlockSkill2 = new Skill();
        warlockSkill2.setSkillName("烈火流星");
        warlockSkill2.setSkillMoney(50000);
        warlockSkill2.setAttackAddition(15);
        warlockSkill2.setMana(100);
        warlockSkill2.setSkillInstruction("召唤大面积的流星雨对敌人造成毁灭性打击，造成攻击力15倍的伤害");
        // 放入集合
        warlockSkills.add(warlockSkill1);
        warlockSkills.add(warlockSkill2);

        // 技能：御剑术
        Skill swordmanSkill1 = new Skill();
        swordmanSkill1.setSkillName("御剑术");
        swordmanSkill1.setSkillMoney(5000);
        swordmanSkill1.setAttackAddition(3);
        swordmanSkill1.setMana(10);
        swordmanSkill1.setSkillInstruction("入门级剑法，以意念御剑远程伤敌，造成3倍攻击力的伤害");
        // 技能：万剑诀
        Skill swordmanSkill2 = new Skill();
        swordmanSkill2.setSkillName("万剑诀");
        swordmanSkill2.setSkillMoney(50000);
        swordmanSkill2.setAttackAddition(10);
        swordmanSkill2.setMana(50);
        swordmanSkill2.setSkillInstruction("进阶级剑法，凭空凝结出无数剑气，聚散交错斩杀敌人，造成10倍攻击力的伤害");
        // 放入集合
        swordmanSkills.add(swordmanSkill1);
        swordmanSkills.add(swordmanSkill2);
        // 技能：枪斗术
        Skill shooterskill1 = new Skill();
        shooterskill1.setSkillName("枪斗术");
        shooterskill1.setSkillMoney(3000);
        shooterskill1.setAttackAddition(3);
        shooterskill1.setMana(15);
        shooterskill1.setSkillInstruction("给一枪，3被伤害");
        // 技能：开火
        Skill shooterskill2 = new Skill();
        shooterskill2.setSkillName("开火");
        shooterskill2.setSkillMoney(60000);
        shooterskill2.setAttackAddition(10);
        shooterskill2.setMana(80);
        shooterskill2.setSkillInstruction("开大炮，10被伤害");
        // 放入集合
        shooterSkills.add(shooterskill1);
        shooterSkills.add(shooterskill2);
    }

}
