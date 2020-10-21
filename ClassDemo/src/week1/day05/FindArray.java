package week1.day05;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        int inputNum=input.nextInt();
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                if (inputNum==arr1[i][j]){
                    System.out.println("第"+(i+1)+"行"+"第"+(j+1)+"列");
                }
            }
        }
    }
}
