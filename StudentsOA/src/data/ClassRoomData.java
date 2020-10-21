package data;

import model.ClassRoom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomData {

    public static void saveClass(List<ClassRoom> classRooms) throws Exception {
        File file = new File("StudentsOA\\src\\data\\classRoomList.txt");
        if (file.length() == 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(classRooms);
            oos.flush();
            oos.close();
        } else {

            List<ClassRoom> list = getClassRoom();
            list.addAll(classRooms);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\classRoomList.txt"));

            oos.writeObject(list);
            oos.flush();
            oos.close();
        }
    }

    public static List<ClassRoom> getClassRoom() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\classRoomList.txt"));
        List<ClassRoom> List = (ArrayList<ClassRoom>) ois.readObject();
        ois.close();
        return List;
    }
    public static ClassRoom getClassRoomS(List<ClassRoom> List, int classNum){
        ClassRoom classRoom = List.get(classNum-1);
        return classRoom;
    }

}
