package data;

import model.Admin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-09-28  14:46
 */
public class AdminData {
    public static void saveAdmin(List<Admin> admins) throws Exception {
        File file = new File("StudentsOA\\src\\data\\adminList.txt");
        if (file.length() == 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(admins);
            oos.flush();
            oos.close();
        } else {

            List<Admin> list = getAdmin();
            list.addAll(admins);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\adminList.txt"));

            oos.writeObject(list);
            oos.flush();
            oos.close();
        }
    }

    public static List<Admin> getAdmin() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\adminList.txt"));
        List<Admin> adminList = (ArrayList<Admin>) ois.readObject();
        ois.close();
        return adminList;
    }

    public static Admin getAdminMethod() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\adminList.txt"));
        List<Admin> adminsList = (ArrayList<Admin>) ois.readObject();
        ois.close();
        Admin admin = adminsList.get(0);
        return admin;
    }


}
