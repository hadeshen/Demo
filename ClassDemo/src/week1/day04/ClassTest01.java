package week1.day04;

import java.util.Scanner;

public class ClassTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入人数：");
        //学生人数
        int inputNum = input.nextInt();
        //存放成绩
        int[] score = new int[inputNum];
        //将输入存入数组中
        for (int i=0;i<score.length;i++){
            System.out.println("输入第"+(i+1)+"个同学的成绩：");
            score[i]=input.nextInt();
        }
        int max=score[0];
        for (int i=1;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
        }
        for (int i=0;i<score.length;i++){
            if (score[i]>=max-10){
                System.out.println("第"+(i+1)+"个同学成绩等级为A");
            }else if (score[i]>=max-20){
                System.out.println("第"+(i+1)+"个同学成绩等级为B");
            }else if (score[i]>=max-30){
                System.out.println("第"+(i+1)+"个同学成绩等级为C");
            }

        }
    }
}
