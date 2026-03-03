package Dao.DichVu;

import Dao.DBConnection;
import Model.DichVu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DichVuDAO implements IDichVuDAO {

    @Override
    public boolean insert(DichVu dv) {

        String sql = "INSERT INTO DichVu(tenDichVu,gia) VALUES(?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dv.getTenDichVu());
            ps.setDouble(2, dv.getGia());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<DichVu> getAll() {

        List<DichVu> list = new ArrayList<>();
        String sql = "SELECT * FROM DichVu";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                DichVu dv = new DichVu();
                dv.setId(rs.getInt("id"));
                dv.setTenDichVu(rs.getString("tenDichVu"));
                dv.setGia(rs.getDouble("gia"));
                list.add(dv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override public boolean update(DichVu dv){return false;}
    @Override public boolean delete(int id){return false;}
    @Override public DichVu findById(int id){return null;}
}
