package service.area;

import data.ClassRoomData;
import model.ClassRoom;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;


public class ClassRoomArea {
    public static void ClassRoomAreaINT() throws Exception {
        while (true) {
            String[] menus = {"1：班级列表", "2：新增班级", "3：删除班级", "4：退会到管理员区"};
            for (String item : menus) {
                System.out.print(item + "\n");
            }
            System.out.println("-----------------------------");
            System.out.println("请进行功能选择：");
            Scanner scanner = new Scanner(System.in);
            int menuID = scanner.nextInt();
            switch (menuID) {
                case 1:
                    getClassRoomList();
                    break;
                case 2:
                    addClassRoom();
                    break;
                case 3:
                    deleteClassRoom();
                    break;

                case 4:
                    return;
                default:
            }
        }
    }

    public static void getClassRoomList() throws Exception {
        System.out.println("=====查看班级列表=====");
        List<ClassRoom> roomList = ClassRoomData.getClassRoom();
        for (ClassRoom c : roomList) {
            System.out.println(c);
        }
        System.out.println("-----------------------------");
    }


    public static void addClassRoom() throws Exception {
        System.out.println("-----------------------------");
        ClassRoom classRoom = new ClassRoom();
        List<ClassRoom> classList = ClassRoomData.getClassRoom();
        classRoom.setClassNum(classList.size() + 1);
        classList.add(classRoom);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\classRoomList.txt"));

        oos.writeObject(classList);
        oos.flush();
        oos.close();
        System.out.println("添加成功！");
        System.out.println("新增班级号为：" + classRoom.getClassNum());
    }

    public static void deleteClassRoom() throws Exception {
        System.out.println("-----------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的班级号：");
        int i = input.nextInt();
        List<ClassRoom> classList = ClassRoomData.getClassRoom();
        classList.set(i - 1, null);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\classRoomList.txt"));

        oos.writeObject(classList);
        oos.flush();
        oos.close();
        System.out.println("删除成功！");
        System.out.println(i + "班已删除！");
    }

}
