package Dao.HoaDon;

import java.util.List;
import Model.HoaDon;

public interface IHoaDonDAO {

    boolean insert(HoaDon hd);

    boolean update(HoaDon hd);

    boolean delete(int id);

    HoaDon findById(int id);

    List<HoaDon> getAll();
}
