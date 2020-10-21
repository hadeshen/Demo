package service.dao;

import java.util.List;

/**
 * @author chenlin
 * @create 2020-09-25  15:37
 */
public interface StudentDAO {
    /**
     * 学生注册
     * 由用户输入姓名、密码、性别
     *
     * @param name     姓名
     * @param password 密码
     * @param sex      性别
     * @return 注册成功系统自动生成学号，返回学号，登录需要使用学号登录
     * @throws Exception
     */
    public int studentRegist(String name, String password, char sex) throws Exception;


    /**
     * 学生登录
     *
     * @param studentId 学号
     * @param password  密码
     * @return 登录成功返回 true
     * @throws Exception
     */
    public boolean studentLogin(int studentId, String password) throws Exception;

    /**
     * 修改学生个人密码
     *
     * @param studentId 学号
     * @param password 要修改的密码
     * @return 修改成功返回true
     * @throws Exception
     */
    public boolean changePassword(int studentId,String password) throws Exception;

    /**
     * 查看个人班级信息  班级-课程
     *
     * @param studentId 学号
     * @return 信息列表
     * @throws Exception
     */
    public List getInfo(int studentId) throws Exception;

    /**
     * 获取各科成绩
     *
     * @param studentId 学号
     * @return 成绩列表
     * @throws Exception
     */
    public List getScore(int studentId) throws Exception;
}
