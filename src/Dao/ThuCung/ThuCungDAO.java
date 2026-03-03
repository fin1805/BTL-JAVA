package Dao.ThuCung;

import Dao.DBConnection;
import Model.ThuCung;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThuCungDAO implements IThuCungDAO {

    @Override
    public boolean insert(ThuCung tc) {
        String sql = "INSERT INTO ThuCung(ten,giong,tuoi,idKhachHang) VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, tc.getTen());
            ps.setString(2, tc.getGiong());
            ps.setInt(3, tc.getTuoi());
            ps.setInt(4, tc.getKhachHangId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ThuCung> getAll() {
        List<ThuCung> list = new ArrayList<>();
        String sql = "SELECT * FROM ThuCung";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                ThuCung tc = new ThuCung();
                tc.setId(rs.getInt("id"));
                tc.setTen(rs.getString("ten"));
                tc.setGiong(rs.getString("giong"));
                tc.setTuoi(rs.getInt("tuoi"));
                tc.setKhachHangId(rs.getInt("idKhachHang"));
                list.add(tc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean update(ThuCung tc) {
        String sql = "UPDATE ThuCung SET ten=?, giong=?, tuoi=?, idKhachHang=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, tc.getTen());
            ps.setString(2, tc.getGiong());
            ps.setInt(3, tc.getTuoi());
            ps.setInt(4, tc.getKhachHangId());
            ps.setInt(5, tc.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM ThuCung WHERE id=?";

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
    public ThuCung findById(int id) {
        return null;
    }
}
