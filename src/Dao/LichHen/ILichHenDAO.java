package Dao.LichHen;

import Model.LichHen;

import java.util.List;

public interface ILichHenDAO {

    boolean insert(LichHen lh);

    boolean update(LichHen lh);

    boolean delete(int id);

    LichHen findById(int id);

    List<LichHen> getAll();
}
