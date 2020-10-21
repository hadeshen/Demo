package week2.day2;

public class PassObject {
    public void printAreas(Clircle c,int time){
        for (int i=1;i<=time;i++){
            Clircle clircle = new Clircle();
            double a=clircle.findArea();
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        PassObject passObject = new PassObject();

    }
}
