package Dao.SuDung;

import java.util.List;
import Model.SuDung;

public interface ISuDungDAO {

    boolean insert(SuDung sd);

    boolean delete(int hoaDonId, int dichVuId);

    List<SuDung> getByHoaDonId(int hoaDonId);
}
