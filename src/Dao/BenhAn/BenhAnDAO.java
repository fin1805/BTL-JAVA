package Dao.BenhAn;

import Dao.DBConnection;
import Model.BenhAn;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenhAnDAO implements IBenhAnDAO {

    @Override
    public boolean insert(BenhAn ba) {

        String sql = "INSERT INTO BenhAn(lichHenId, chanDoan, phuongPhapDieuTri, ghiChu, ngayTao) VALUES(?,?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ba.getLichHenId());
            ps.setString(2, ba.getChanDoan());
            ps.setString(3, ba.getPhuongPhapDieuTri());
            ps.setString(4, ba.getGhiChu());

            if (ba.getNgayTao() != null) {
                ps.setDate(5, Date.valueOf(ba.getNgayTao()));
            } else {
                ps.setDate(5, null);
            }

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<BenhAn> getAll() {

        List<BenhAn> list = new ArrayList<>();
        String sql = "SELECT * FROM BenhAn";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                BenhAn ba = new BenhAn();
                ba.setId(rs.getInt("id"));
                ba.setLichHenId(rs.getInt("lichHenId"));
                ba.setChanDoan(rs.getString("chanDoan"));
                ba.setPhuongPhapDieuTri(rs.getString("phuongPhapDieuTri"));
                ba.setGhiChu(rs.getString("ghiChu"));

                Date d = rs.getDate("ngayTao");
                if (d != null) {
                    ba.setNgayTao(d.toLocalDate());
                }

                list.add(ba);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public BenhAn findById(int id) {

        String sql = "SELECT * FROM BenhAn WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                BenhAn ba = new BenhAn();
                ba.setId(rs.getInt("id"));
                ba.setLichHenId(rs.getInt("lichHenId"));
                ba.setChanDoan(rs.getString("chanDoan"));
                ba.setPhuongPhapDieuTri(rs.getString("phuongPhapDieuTri"));
                ba.setGhiChu(rs.getString("ghiChu"));

                Date d = rs.getDate("ngayTao");
                if (d != null) {
                    ba.setNgayTao(d.toLocalDate());
                }

                return ba;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean update(BenhAn ba) {

        String sql = "UPDATE BenhAn SET lichHenId=?, chanDoan=?, phuongPhapDieuTri=?, ghiChu=?, ngayTao=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, ba.getLichHenId());
            ps.setString(2, ba.getChanDoan());
            ps.setString(3, ba.getPhuongPhapDieuTri());
            ps.setString(4, ba.getGhiChu());

            if (ba.getNgayTao() != null) {
                ps.setDate(5, Date.valueOf(ba.getNgayTao()));
            } else {
                ps.setDate(5, null);
            }

            ps.setInt(6, ba.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(int id) {

        String sql = "DELETE FROM BenhAn WHERE id=?";

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
