package week3.day5;

/**
 * @author：陈林
 * @date：2020/8/21 8:58
 */
public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;
    public Frock(){
        Frock.getNextNum();
    }

    public static int getCurrentNum() {
        return currentNum;
    }

    public static void setCurrentNum(int currentNum) {
        Frock.currentNum = currentNum;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public static void main(String[] args) {
        Frock a = new Frock();
        Frock b = new Frock();
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum());
    }
}
