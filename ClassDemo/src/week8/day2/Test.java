package week8.day2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author chenlin
 * @create 2020-09-22  16:48
 */
public class Test {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //键盘输入
        int score=0;
        StringBuffer answer=new StringBuffer();
        //用户输入的答案存放在可以更改的缓冲流中
        String result="ACDD";
        //标准答案存放在字符常量区中
        try{
            //其中含有异常，所以要进行try-catch
            FileReader inOne=new FileReader("exmer.txt");
            //路径的另外两种写法(D:/test.txt)或者(D/text.txt)
            BufferedReader inTwo=new BufferedReader(inOne);
            String s=null;
            //读一行能够读到
            while((s=inTwo.readLine())!=null){
                if(s.startsWith("*")==false)
                //若不是以*开始的，直接输出题目要求即可
                {
                    System.out.println(s);
                } else {
                    System.out.println("请输入选择的答案(A,B,C,D):");
                    String str=input.nextLine();
                    try{
                        char c=str.charAt(0);
                        answer.append(c);
                    }
                    catch(StringIndexOutOfBoundsException exp){
                        answer.append("*");
                    }
                }
            }

            inOne.close();
            inTwo.close();
        }
        catch(IOException exp){

        }
        for(int i=0;i<result.length();i++){
            //匹配答案
            if(result.charAt(i)==answer.charAt(i)) {
                score+=25;
            }
        }
        System.out.printf("最终得分为：%d\n",score);
    }

}

