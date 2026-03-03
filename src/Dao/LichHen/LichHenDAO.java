package Dao.LichHen;

import Dao.DBConnection;
import Model.LichHen;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LichHenDAO implements ILichHenDAO {

    @Override
    public boolean insert(LichHen lh) {

        String sql = "INSERT INTO LichHen(thuCungId,bacSiId,thoiGian,lyDoKham,trangThai,ghiChu) VALUES(?,?,?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, lh.getThuCungId());
            ps.setInt(2, lh.getBacSiId());
            ps.setTimestamp(3, Timestamp.valueOf(lh.getThoiGian()));
            ps.setString(4, lh.getLyDoKham());
            ps.setString(5, lh.getTrangThai());
            ps.setString(6, lh.getGhiChu());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<LichHen> getAll() {

        List<LichHen> list = new ArrayList<>();
        String sql = "SELECT * FROM LichHen";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                LichHen lh = new LichHen();
                lh.setId(rs.getInt("id"));
                lh.setThuCungId(rs.getInt("thuCungId"));
                lh.setBacSiId(rs.getInt("bacSiId"));
                lh.setThoiGian(rs.getTimestamp("thoiGian").toLocalDateTime());
                lh.setLyDoKham(rs.getString("lyDoKham"));
                lh.setTrangThai(rs.getString("trangThai"));
                lh.setGhiChu(rs.getString("ghiChu"));

                list.add(lh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public LichHen findById(int id) {

        String sql = "SELECT * FROM LichHen WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                LichHen lh = new LichHen();
                lh.setId(rs.getInt("id"));
                lh.setThuCungId(rs.getInt("thuCungId"));
                lh.setBacSiId(rs.getInt("bacSiId"));
                lh.setThoiGian(rs.getTimestamp("thoiGian").toLocalDateTime());
                lh.setLyDoKham(rs.getString("lyDoKham"));
                lh.setTrangThai(rs.getString("trangThai"));
                lh.setGhiChu(rs.getString("ghiChu"));

                return lh;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean update(LichHen lh) {

        String sql = "UPDATE LichHen SET thuCungId=?, bacSiId=?, thoiGian=?, lyDoKham=?, trangThai=?, ghiChu=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, lh.getThuCungId());
            ps.setInt(2, lh.getBacSiId());
            ps.setTimestamp(3, Timestamp.valueOf(lh.getThoiGian()));
            ps.setString(4, lh.getLyDoKham());
            ps.setString(5, lh.getTrangThai());
            ps.setString(6, lh.getGhiChu());
            ps.setInt(7, lh.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(int id) {

        String sql = "DELETE FROM LichHen WHERE id=?";

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
