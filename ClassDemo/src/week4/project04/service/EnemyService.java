package week4.project04.service;


import week4.project04.model.Enemy;
import week4.project04.model.Place;

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
        return null;
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
        return 0;
    }
}
