package Dao;

import Dao.DBConnection;
import Model.TaiKhoan;
import java.sql.*;

public class TaiKhoanDAO {

    // ===== LOGIN =====
    public TaiKhoan checkLogin(String username, String password) {

        String sql = "SELECT * FROM taikhoan WHERE username=? AND password=? AND trangThai=1";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setId(rs.getInt("id"));
                tk.setUsername(rs.getString("username"));
                tk.setHoTen(rs.getString("hoTen"));
                tk.setVaiTro(rs.getString("vaiTro"));
                tk.setTrangThai(rs.getBoolean("trangThai"));
                return tk;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // ===== THÊM =====
    public boolean insert(TaiKhoan tk) {

        String sql = "INSERT INTO taikhoan(username,password,hoTen,vaiTro,trangThai) VALUES(?,?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, tk.getUsername());
            ps.setString(2, tk.getPassword());
            ps.setString(3, tk.getHoTen());
            ps.setString(4, tk.getVaiTro());
            ps.setBoolean(5, tk.isTrangThai());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
