package data;

import model.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CourseData {
    public static void saveCourse(List<Course> courses) throws Exception {
        File file = new File("StudentsOA\\src\\data\\courseList.txt");
        if (file.length() == 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(courses);
            oos.flush();
            oos.close();
        } else {

            List<Course> list = getCourse();
            list.addAll(courses);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\courseList.txt"));

            oos.writeObject(list);
            oos.flush();
            oos.close();
        }
    }

    public static List<Course> getCourse() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\courseList.txt"));
        List<Course> List = (ArrayList<Course>) ois.readObject();
        ois.close();
        return List;
    }
    public static Course getCourseS(List<Course> List, int classNum){
        Course course = List.get(classNum-1);
        return course;
    }
}
