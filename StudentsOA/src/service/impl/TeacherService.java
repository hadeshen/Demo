package service.impl;


import model.ClassRoom;
import model.Course;
import model.Student;
import model.Teacher;
import util.StreamUtil;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class TeacherService {
	//注册
	public static int teacherRegist(String name, String password, char sex,String courseName,int classNum) throws Exception {
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setPassword(password);
		teacher.setSex(sex);
		teacher.setTeacherId(StreamUtil.getTeacher().size()+101);
		teacher.setClassRoom(new ClassRoom(classNum));
		teacher.setCourse(new Course(courseName));
		List<Teacher> list = StreamUtil.getTeacher();
		list.add(teacher);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

		oos.writeObject(list);
		oos.flush();
		oos.close();
		return teacher.getTeacherId();
	}

	//登录
	public static boolean teacherLogin(int teacherId, String password) throws Exception {
		List<Teacher> teacher = StreamUtil.getTeacher();
		Teacher teacher1 = null;
		try {
			teacher1 = StreamUtil.getTeacherMethod(teacherId);
		} catch (Exception e) {
			return false;
		}

		if (teacherId == teacher1.getTeacherId() && password.equals(teacher1.getPassword())) {
			return true;
		}else {
			return false;
		}
	}


	//老师个人信息修改
	public static boolean changeTeacher(int teacherId, String name, String password, char sex,int classNum, String course) throws Exception {
		Teacher teacher = StreamUtil.getTeacherMethod(teacherId);
		teacher.setName(name);
		teacher.setPassword(password);
		teacher.setSex(sex);
		teacher.setClassRoom(new ClassRoom(classNum));
		teacher.setCourse(new Course(course));
		List<Teacher> list = StreamUtil.getTeacher();
		list.set(teacherId-101,teacher);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

		oos.writeObject(list);
		oos.flush();
		oos.close();
		return true;
	}

	/*
	 * 班级管理（当前管理班级的增删查改）
	 */
	//增加班级
	public static boolean addTeacherClass(int teacherId, int classNum) throws Exception {
		Teacher teacher = StreamUtil.getTeacherMethod(teacherId);
		if (teacher.getClassRoom() == null) {
			teacher.setClassRoom(new ClassRoom(classNum));
		} else {
			System.out.println("你已经有管理班级了，请勿再添加！");
			return false;
		}
		List<Teacher> list = StreamUtil.getTeacher();
		list.set(teacherId-101,teacher);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

		oos.writeObject(list);
		oos.flush();
		oos.close();
		return true;
	}

	//删除班级  不教了
	public static boolean deleteTeacherClass(int teacherId) throws Exception {
		Teacher teacher = StreamUtil.getTeacherMethod(teacherId);
		teacher.setClassRoom(null);
		List<Teacher> list = StreamUtil.getTeacher();
		list.set(teacherId-101,teacher);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

		oos.writeObject(list);
		oos.flush();
		oos.close();
		return true;
	}
	//查看班级
	public static void showTeacherClass(int teacherId) throws Exception {
		Teacher teacher = StreamUtil.getTeacherMethod(teacherId);
		ClassRoom classRoom = teacher.getClassRoom();
		System.out.println(classRoom);

	}

	/**
	 *换个班教
	 * @param teacherId
	 * @param classNum 修改后的班级号
	 * @return
	 * @throws Exception
	 */
	public static boolean changeTeacherClass(int teacherId,int classNum) throws Exception {
		Teacher teacher = StreamUtil.getTeacherMethod(teacherId);
		teacher.getClassRoom().setClassNum(classNum);
		List<Teacher> list = StreamUtil.getTeacher();
		list.set(teacherId-101,teacher);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

		oos.writeObject(list);
		oos.flush();
		oos.close();
		return true;
	}


	/*
	 * 学生管理（当前管理班级下学生的增删查）
	 */
	public static void addStudent(Teacher teacher, Student student) {
		if (student.getClassRoom().getClassNum() != 0) {
			student.getClassRoom().setClassNum(
					teacher.getClassRoom().getClassNum());
		} else {
			System.out.println("该学生已经有班级了，请勿重复添加！");
		}
	}



	/*
	 * 5.学生成绩管理 a)学生成绩列表 b)平均分 c)降序查看学生成绩（默认升序）
	 * 学生成绩导出（可导出到excel—IO流实现）
	 */
	public static void getScore() throws Exception {
		List<Student> list = StreamUtil.getStudent();
		for (Student student : list) {
			System.out.println(student.getName() + "：" + student.getScore());
		}
	}

	public static void getAverageScore() throws Exception {
		List<Student> list = StreamUtil.getStudent();
		double num = 0;
		double averageScore = 0;
		for (Student student : list) {
			num += student.getScore();
		}
		averageScore = num / list.size()+1;
		System.out.println("平均分为："+averageScore);
	}

	public static void getDownScore() throws Exception {
		List<Student> list = StreamUtil.getStudent();
		Map<Double, String> map = new HashMap<Double, String>();
		for (Student student : list) {
			map.put(student.getScore(), student.getName());
		}
		Iterator<Map.Entry<Double, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Double, String> entry = iterator.next();
			System.out.println(entry.getValue() + "的分数：" + entry.getKey());
		}
	}

}
