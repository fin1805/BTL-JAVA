package Dao.DichVu;

import Model.DichVu;

import java.util.List;

public interface IDichVuDAO {

    boolean insert(DichVu dv);

    boolean update(DichVu dv);

    boolean delete(int id);

    DichVu findById(int id);

    List<DichVu> getAll();
}
