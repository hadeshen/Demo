package week4.Exorcist.service;


import week4.Exorcist.data.PlaceData;
import week4.Exorcist.model.Place;
import week4.Exorcist.util.ScannerUtil;

/**
 * 跟场景相关的方法
 */
public class PlaceService {
    /**
     * 选择场景
     *
     * @return 返回玩家选中的场景
     */
    public static Place choicePlace() {

        System.out.println("有这些场景可供您选择：");
        // 1.输出游戏场景数据PlaceData中存在的场景信息
        // 1.输出游戏场景数据PlaceData中存在的场景信息
        for (int i = 0; i <  PlaceData.places.length; i++) {
            System.out.println((i+1)+"."+PlaceData.places[i].getPlaceName());
        }
        // 2.定义一个场景对象以便后面返回
        Place place=null;
        System.out.println("请选择游戏区：");
        // 3.让玩家根据数字做出选择，输入有误可以重复选择
        int a= ScannerUtil.scanner.nextInt();
        switch (a){
            case 1:
                place= PlaceData.places[0];
                break;
            case 2:
                place=PlaceData.places[1];
                break;
            case 3:
                place=PlaceData.places[2];
                break;
            default:
                System.out.println("输入不正确");
                choicePlace();
                break;
        }
        // 4.输出场景信息
        return place;
    }
}
