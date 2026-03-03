package Controller;

import Dao_1.TaiKhoanDAO;
import Model.TaiKhoan;

public class LoginController {

    private TaiKhoanDAO taiKhoanDAO;

    public LoginController() {
        taiKhoanDAO = new TaiKhoanDAO();
    }

    public TaiKhoan login(String username, String password) {

        if (username.isEmpty() || password.isEmpty()) {
            return null;
        }

        return taiKhoanDAO.checkLogin(username, password);
    }
}
