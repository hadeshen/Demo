package week5.day1;

/**
 * @author：陈林
 * @date：2020/9/1 19:26
 * 根据传入得路径，获取文件名。例如：D:\myfile\hello.java
 * 取出hello.java
 */
public class StringTeat1 {
    public void getFileName() {
        StringBuffer fileName = new StringBuffer("D:\\myfile\\hello.java");
        //lastIndexOf索引“//”最后一次出现的位置
        System.out.println(fileName.lastIndexOf("\\"));
        System.out.println(fileName.substring(fileName.lastIndexOf("\\") + 1));

    }

    public static void main(String[] args) {
        StringTeat1 stringTeat1 = new StringTeat1();
        stringTeat1.getFileName();
    }
}
