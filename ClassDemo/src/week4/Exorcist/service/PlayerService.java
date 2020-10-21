package week4.Exorcist.service;


import week4.Exorcist.model.Enemy;
import week4.Exorcist.model.Player;
import week4.Exorcist.util.ScannerUtil;


public class PlayerService {

    /**
     * 初始化玩家角色信息
     *
     * @return 返回实例化的player对象
     */
    public Player initPlayer() {

        // 1.输出欢迎信息
        System.out.println("*****************************************");
        System.out.println("欢迎来到大型文字角色扮演游戏《伏魔录》");
        System.out.println("我该如何称呼您？");

        // 2.输出角色名
        String name = ScannerUtil.scanner.next();
        System.out.println("亲爱的" + name + "你好");

        // 3.调用构造函数初始化角色
        Player player = new Player(name, 1, 0, 100000, 5, 10, 500, 500, 300, 300);
        ProfessionService p = new ProfessionService();
        //新建选择角色对象
        player.setProfession(p.choiceProfession());
        //赋值角色给当前玩家
        System.out.println("恭喜你成为一名" + player.getProfession().getProfessionName());
        //展示当前信息
        showMassage(player);
        return player;
    }

    //展示玩家信息
    public void showMassage(Player player) {
        System.out.println("你现在的信息：");
        System.out.println("姓名：" + player.getPlayerName());
        System.out.println("职业：" + player.getProfession().getProfessionName());
        System.out.println("等级：" + player.getLevel());
        System.out.println("金币：" + player.getMoney());
        System.out.println("攻击力：" + player.getAttack());
        System.out.println("防御：" + player.getDefense());
        System.out.println("血量：" + player.getHp());
        System.out.println("血量上限：" + player.getMaxHp());
        System.out.println("法力值：" + player.getMana());
        System.out.println("法力值上限：" + player.getMaxMana());
    }

    /**
     * 玩家跟敌人战斗
     *
     * @param player 参与战斗的玩家
     * @param enemy  挑战的敌人
     */
    public void fight(Player player, Enemy enemy) {

        // 1.使用do-while循环，持续进行战斗，到有一方血量扣完为止
        // 2.玩家选择行为
        // 3.敌人生命值进行扣减
        // 4.对于敌人是否战败进行判断
        int enemyHp = enemy.getHp();
        //储存敌人满血的血量
        do {
            System.out.println("你当前的血量：" + player.getHp() + "    你当前的蓝量：" + player.getMana());
            System.out.println("怪物当前血量：" + enemy.getHp());
            switch (action(player)) {
                case 1:
                    enemy.setHp(enemy.getHp() - attack(player));
                    break;
                case 2:
                    enemy.setHp(enemy.getHp() - userSkill(player));
                    break;
                default:
                    System.out.println("输入错误");
            }
            player.setHp(player.getHp() - EnemyService.action(enemy));


        } while (player.getHp() > 0 && enemy.getHp() > 0);
        victory(player, enemy);
        //刷新敌人
        enemy.setHp(enemyHp);
        levelUp(player);

    }

    /**
     * 玩家选择战斗中的行为,攻击或者释放技能
     *
     * @param player 参与战斗的玩家
     * @return 对敌人造成伤害
     */
    private int action(Player player) {

        // 输出可选行动
        System.out.println("----------------------------------------------");
        System.out.println("当前回合，您可采取如下行动：");
        System.out.println("1.平a");
        System.out.println("2.释放技能");
        int chose = ScannerUtil.scanner.nextInt();
        if (chose == 1 || chose == 2) {
            return chose;
        } else {
            return 0;
        }


    }

    /**
     * 玩家对敌人进行普通攻击
     *
     * @param player 参与战斗的玩家
     * @return 攻击产生的伤害
     */
    private int attack(Player player) {
        return player.getAttack();
    }

    /**
     * 玩家对敌人释放技能进行攻击
     *
     * @param player 参与战斗的玩家
     * @return 技能产生的伤害
     */
    private int userSkill(Player player) {
        if (player.getSkills().isEmpty()) {
            System.out.println("你现在没有任何技能，只能使用拳头");
            return 0;
        } else {
            //遍历打印技能列表
            for (int i = 0; i < player.getSkills().size(); i++) {
                System.out.println((i + 1) + "." + player.getSkills().get(i).getSkillName());
            }
            //输入技能
            System.out.println("选择你的技能：");
            int chose = ScannerUtil.scanner.nextInt() - 1;
            //判断是否有该技能
            if (chose <= player.getSkills().size()) {
                //通过蓝量判断是否释放技能
                if (player.getSkills().get(chose).getMana() < player.getMaxMana()) {
                    //更新蓝量
                    player.setMana(player.getMana() - player.getSkills().get(chose).getMana());
                    return player.getSkills().get(chose).getAttackAddition(player);
                } else {
                    System.out.println("蓝量不足，不能释放技能");
                    return 0;


                }
            } else {
                System.out.println("你当前没有其他的技能！");
                return 0;
            }

        }

    }

    /**
     * 战斗胜利后玩家获得金钱奖励，以及经验
     * 升级玩家可以提升属性
     *
     * @param player 战斗胜利的玩家
     * @param enemy  被击败的敌人
     */
    private void victory(Player player, Enemy enemy) {
        if (enemy.getHp() <= 0) {
            System.out.println("恭喜你获得胜利");
            System.out.println("你现在的血量为：" + player.getHp());
            System.out.println("获得了：   " + enemy.getExp() + "经验值;   " + enemy.getMoney() + "金币");
            player.setExp(player.getExp() + enemy.getExp());
            player.setMoney(player.getMoney() + enemy.getMoney());
        } else {
            System.out.println("你输了");
        }
    }

    /**
     * 玩家升级
     *
     * @param player 要升级的玩家
     */
    private void levelUp(Player player) {
        if (player.getExp() >= player.getLevel() * 10) {
            player.setExp(player.getExp() - player.getLevel() * 10);
            //升级后经验变化
            player.setLevel(player.getLevel() + 1);
            //等级加一
            player.setMaxHp(player.getMaxHp() + player.getLevel() * 10);
            //血量上限变化
            player.setMaxMana(player.getMaxMana() + player.getLevel() * 10);
            //蓝量上限变化
            System.out.println("恭喜你升级，当前等级为：" + player.getLevel() + "   当前经验为：" + player.getExp());
            levelUp(player);
            //再次判断
        } else {
            return;
        }


    }


}
