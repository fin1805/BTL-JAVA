package Dao.BacSi;

import Dao.DBConnection;
import Model.BacSi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BacSiDAO implements IBacSiDAO {

    @Override
    public boolean insert(BacSi bs) {
        String sql = "INSERT INTO BacSi(hoTen,chuyenMon,soDienThoai) VALUES(?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, bs.getHoTen());
            ps.setString(2, bs.getChuyenMon());
            ps.setString(3, bs.getSoDienThoai());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<BacSi> getAll() {
        List<BacSi> list = new ArrayList<>();
        String sql = "SELECT * FROM BacSi";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                BacSi bs = new BacSi();
                bs.setId(rs.getInt("id"));
                bs.setHoTen(rs.getString("hoTen"));
                bs.setChuyenMon(rs.getString("chuyenMon"));
                bs.setSoDienThoai(rs.getString("soDienThoai"));
                list.add(bs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean update(BacSi bs) {
        String sql = "UPDATE BacSi SET hoTen=?, chuyenMon=?, soDienThoai=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, bs.getHoTen());
            ps.setString(2, bs.getChuyenMon());
            ps.setString(3, bs.getSoDienThoai());
            ps.setInt(4, bs.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM BacSi WHERE id=?";

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
    public BacSi findById(int id) {

        String sql = "SELECT * FROM BacSi WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                BacSi bs = new BacSi();
                bs.setId(rs.getInt("id"));
                bs.setHoTen(rs.getString("hoTen"));
                bs.setChuyenMon(rs.getString("chuyenMon"));
                bs.setSoDienThoai(rs.getString("soDienThoai"));
                return bs;   // ← PHẢI LÀ NHƯ NÀY
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;   // ← bắt buộc phải có
    }}

