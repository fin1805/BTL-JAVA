package Dao.TaiKhoan;

import Dao.DBConnection;
import Model.TaiKhoan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAOImplement implements TaiKhoanDAO {

    @Override
    public boolean insert(TaiKhoan tk) {
        String sql = "INSERT INTO TaiKhoan(username,password,hoTen,vaiTro,trangThai) VALUES(?,?,?,?,?)";

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

    @Override
    public List<TaiKhoan> getAll() {
        List<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM TaiKhoan";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setId(rs.getInt("id"));
                tk.setUsername(rs.getString("username"));
                tk.setPassword(rs.getString("password"));
                tk.setHoTen(rs.getString("hoTen"));
                tk.setVaiTro(rs.getString("vaiTro"));
                tk.setTrangThai(rs.getBoolean("trangThai"));
                list.add(tk);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public TaiKhoan checkLogin(String username, String password) {

        String sql = "SELECT * FROM TaiKhoan WHERE username=? AND password=? AND trangThai=1";

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

    @Override
    public boolean update(TaiKhoan tk) {
        String sql = "UPDATE TaiKhoan SET password=?, hoTen=?, vaiTro=?, trangThai=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, tk.getPassword());
            ps.setString(2, tk.getHoTen());
            ps.setString(3, tk.getVaiTro());
            ps.setBoolean(4, tk.isTrangThai());
            ps.setInt(5, tk.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM TaiKhoan WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public TaiKhoan findById(int id) {

        String sql = "SELECT * FROM TaiKhoan WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
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
}
