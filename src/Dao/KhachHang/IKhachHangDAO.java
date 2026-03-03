package Dao.KhachHang;

import java.util.List;
import Model.KhachHang;

public interface IKhachHangDAO {

    boolean insert(KhachHang kh);

    boolean update(KhachHang kh);

    boolean delete(int id);

    KhachHang findById(int id);

    List<KhachHang> getAll();
}
