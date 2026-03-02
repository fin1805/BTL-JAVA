package Controller;

import Dao.KhachHangDAO;
import Model.KhachHang;
import java.util.List;

public class KhachHangController {

    private KhachHangDAO dao;

    public KhachHangController() {
        dao = new KhachHangDAO();
    }

    public List<KhachHang> getAll() {
        return dao.getAll();
    }

    public boolean add(KhachHang kh) {
        if (kh.getHoTen().isEmpty()) {
            return false;
        }
        return dao.insert(kh);
    }
}
