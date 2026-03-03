package Dao.HoaDon;

import Dao.DBConnection;
import Model.HoaDon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO implements IHoaDonDAO {

    @Override
    public boolean insert(HoaDon hd) {

        String sql = "INSERT INTO HoaDon(lichHenId, ngayLap, tongTien, trangThai) VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, hd.getLichHenId());

            if (hd.getNgayLap() != null) {
                ps.setDate(2, Date.valueOf(hd.getNgayLap()));
            } else {
                ps.setDate(2, null);
            }

            ps.setDouble(3, hd.getTongTien());
            ps.setString(4, hd.getTrangThai());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<HoaDon> getAll() {

        List<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt("id"));
                hd.setLichHenId(rs.getInt("lichHenId"));
                hd.setTongTien(rs.getDouble("tongTien"));
                hd.setTrangThai(rs.getString("trangThai"));

                Date d = rs.getDate("ngayLap");
                if (d != null) {
                    hd.setNgayLap(d.toLocalDate());
                }

                list.add(hd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public HoaDon findById(int id) {

        String sql = "SELECT * FROM HoaDon WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt("id"));
                hd.setLichHenId(rs.getInt("lichHenId"));
                hd.setTongTien(rs.getDouble("tongTien"));
                hd.setTrangThai(rs.getString("trangThai"));

                Date d = rs.getDate("ngayLap");
                if (d != null) {
                    hd.setNgayLap(d.toLocalDate());
                }

                return hd;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean update(HoaDon hd) {

        String sql = "UPDATE HoaDon SET lichHenId=?, ngayLap=?, tongTien=?, trangThai=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, hd.getLichHenId());
            ps.setDate(2, Date.valueOf(hd.getNgayLap()));
            ps.setDouble(3, hd.getTongTien());
            ps.setString(4, hd.getTrangThai());
            ps.setInt(5, hd.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(int id) {

        String sql = "DELETE FROM HoaDon WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
