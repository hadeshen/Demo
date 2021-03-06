package week4.Exorcist.data;


import week4.Exorcist.model.Profession;

/**
 * 保存着游戏中的职业信息
 */
public class ProfessionData {
    // 存储职业信息的数组
    public static Profession professions[] = new Profession[3];

    static{


        // 第一种职业：剑客
        Profession Profession1 = new Profession("剑客",8,9,8,5);
        Profession1.setSkills(SkillData.swordmanSkills);
        professions[0] = Profession1;

        // 第二种职业：术士
        Profession Profession2 = new Profession("术士",9,5,7,9);
        Profession2.setSkills(SkillData.warlockSkills);
        professions[1] = Profession2;
        // 第二种职业：枪手
        Profession Profession3 = new Profession("枪手",9,5,7,9);
        Profession2.setSkills(SkillData.shooterSkills);
        professions[2] = Profession3;

    }
}
