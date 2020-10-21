package model;

import java.io.Serializable;

/**
 * @author chenlin
 * @create 2020-09-25  11:29
 * 管理员实体类
 */
public class Admin implements Serializable {
    //管理员账号
    private String adminId;
    //密码
    private String password;

    public Admin() {
    }

    public Admin(String adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
