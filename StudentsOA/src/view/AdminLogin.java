package view;


import service.impl.AdminService;

/**
 * @author JIAJUN KOU
 *
 * 登录：
 */

public class AdminLogin {
    public static void adminLogin() throws Exception {

        AdminService adminService=new AdminService();
        adminService.start();
    }



}
