package week4.Exorcist.service;


import week4.Exorcist.data.ProfessionData;
import week4.Exorcist.model.Profession;
import week4.Exorcist.util.ScannerUtil;

/**
 * 跟职业相关的功能
 */
public class ProfessionService {

    /**
     * 选择职业
     *
     * @return 返回玩家选中的职业
     */
    public Profession choiceProfession() {

        System.out.println("有这些职业供您选择：");

        // 输出游戏数据ProfessionData中存在的职业信息
        for (int i = 0; i < ProfessionData.professions.length; i++) {
            // 让每个职业以“序号.职业名”的方式输出显示
            System.out.println((i + 1) + "." + ProfessionData.professions[i].getProfessionName());
        }

        Profession profession = null;

        // 让玩家根据数字做出选择，输入有误可以重复选择
        while (true) {
            int a = ScannerUtil.scanner.nextInt();
            if (a == 1) {
                profession = ProfessionData.professions[0];
                break;
            } else if (a == 2) {
                profession = ProfessionData.professions[1];
                break;
            } else if (a == 3) {
                profession = ProfessionData.professions[2];
                break;
            } else {
                System.out.println("输入有误，请重新输入：");

            }

        }

        return profession;
    }


}
