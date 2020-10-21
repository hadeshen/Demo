package week1.day03;


public class Test01 {
    public static void main(String[] args) {
        int i,j;
        int sum=0;
        for (i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                sum=i*j;
                System.out.print(j+"*"+i+"="+sum+"    ");
            }
            System.out.println(" ");
        }
    }
}
