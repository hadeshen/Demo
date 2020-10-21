package week4.Exorcist.view;


import week4.Exorcist.model.Enemy;
import week4.Exorcist.model.Place;
import week4.Exorcist.model.Player;
import week4.Exorcist.service.EnemyService;
import week4.Exorcist.service.PlaceService;
import week4.Exorcist.service.PlayerService;
import week4.Exorcist.service.npc.NpcDoctorService;
import week4.Exorcist.service.npc.NpcMasterService;
import week4.Exorcist.util.ScannerUtil;

/**
 * 故事
 */
public class Story {
    // 故事中的玩家
    Player player;

    // 故事中的场景
    Place place;
    PlayerService playerService = new PlayerService();

    /**
     * 开始游戏
     */
    public void start() {
// 初始化角色
        player = playerService.initPlayer();
        menu();
    }

    /**
     * 提供游戏行动菜单供玩家选择
     */
    private void menu() {
        System.out.println("----------------------------------------------");
        System.out.println("你接下来要做什么");
        System.out.println("1.打野");
        System.out.println("2.回血");
        System.out.println("3.学技能");
        System.out.println("4.退出游戏");
        int chose = ScannerUtil.scanner.nextInt();
        switch (chose){
            case 1:
                hunt();
                menu();
                break;
            case 2:
                healing();
                menu();
                break;
            case 3:
                learnSkill();
                menu();
                break;
            case 4:
                break;
            default:
                System.out.println("输入错误");
                menu();


        }


    }

    /**
     * 打怪
     */
    private void hunt() {
        System.out.println("----------------------------------------------");
        // 选择要去的场景
       Place  p =  PlaceService.choicePlace();
        System.out.println("----------------------------------------------");
        // 选择要打的敌人
        Enemy e = EnemyService.choiceEnemy(p);
        System.out.println("----------------------------------------------");
        // 玩家与敌人进行战斗
        playerService.fight(player, e);

    }

    /**
     * 疗伤
     */
    private void healing() {
        NpcDoctorService doctor = new NpcDoctorService();
        doctor.helpPlayer(player);

    }

    /**
     * 学习技能
     */
    private void learnSkill() {
        NpcMasterService master = new NpcMasterService();
        master.helpPlayer(player);

    }

}
