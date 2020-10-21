package week8.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-22  17:21
 */
public class Work {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File("d:test.txt")));
        Scanner input = new Scanner(System.in);
        int score = 0;
        char[] result = new char[]{'A','C','D','D'};
        StringBuilder sb = new StringBuilder();
        String data;
        while ((data = br.readLine()) != null){
            if (!data.startsWith("*")){
                System.out.println(data);
            }else {
                System.out.println("请输入答案（ABCD）：");
                sb.append(input.next().toUpperCase());
            }
        }
        br.close();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == sb.charAt(i)){
                score +=25;
            }
        }
        System.out.println("成绩为："+score);
    }
}
