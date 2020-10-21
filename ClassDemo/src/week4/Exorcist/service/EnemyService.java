package week4.Exorcist.service;


import week4.Exorcist.model.Enemy;
import week4.Exorcist.model.Place;
import week4.Exorcist.util.ScannerUtil;

public class EnemyService {
    /**
     * 选择敌人
     *
     * @param place
     * @return
     */
    public static Enemy choiceEnemy(Place place) {
        // 1.从传入的场景place中拿到场景中有的敌人
        // 2.显示全部场景中的敌人
        // 1.从传入的场景place中拿到场景中有的敌人
        Enemy enemy = null;
        place.getEnemys();
        // 2.显示全部场景中的敌人
        System.out.println(place.getPlaceName()+":有以下敌人");
        for (int i = 0; i < place.getEnemys().length; i++) {
            System.out.println((i + 1) + "." + place.getEnemys()[i].getEnemyName());
        }
        //3.选择敌人
        System.out.println("你要攻击的敌人是：");
        int b = ScannerUtil.scanner.nextInt();
        switch (b) {
            case 1:
                enemy = place.getEnemys()[0];
                System.out.println("遭遇了敌人:" + enemy.getEnemyName());
                break;
            case 2:
                enemy = place.getEnemys()[1];
                System.out.println("遭遇了敌人:" + enemy.getEnemyName());
                break;
            case 3:
                enemy = place.getEnemys()[2];
                System.out.println("遭遇了敌人:" + enemy.getEnemyName());
                break;
            default:
                System.out.println("输入不正确");
                break;
        }
        return enemy;
    }

    public static int action(Enemy enemy) {
        return attack(enemy);
    }

    /**
     * 敌人普通攻击
     *
     * @param enemy 对战中的敌人
     * @return 敌人普通攻击造成的伤害
     */
    private static int attack(Enemy enemy) {
        if (enemy.getHp() > 0)
            return enemy.getAttack();
        else
            return 0;
    }
}
