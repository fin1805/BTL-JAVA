package Dao.SuDung;

import Dao.DBConnection;
import Model.SuDung;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SuDungDAO implements ISuDungDAO {

    @Override
    public boolean insert(SuDung sd) {

        String sql = "INSERT INTO SuDung(hoaDonId, dichVuId, soLuong, donGia) VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, sd.getHoaDonId());
            ps.setInt(2, sd.getDichVuId());
            ps.setInt(3, sd.getSoLuong());
            ps.setDouble(4, sd.getDonGia());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(int hoaDonId, int dichVuId) {

        String sql = "DELETE FROM SuDung WHERE hoaDonId=? AND dichVuId=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, hoaDonId);
            ps.setInt(2, dichVuId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<SuDung> getByHoaDonId(int hoaDonId) {

        List<SuDung> list = new ArrayList<>();
        String sql = "SELECT * FROM SuDung WHERE hoaDonId=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, hoaDonId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                SuDung sd = new SuDung();
                sd.setHoaDonId(rs.getInt("hoaDonId"));
                sd.setDichVuId(rs.getInt("dichVuId"));
                sd.setSoLuong(rs.getInt("soLuong"));
                sd.setDonGia(rs.getDouble("donGia"));

                list.add(sd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
