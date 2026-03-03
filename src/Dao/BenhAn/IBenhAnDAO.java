package Dao.BenhAn;

import Model.BenhAn;

import java.util.List;

public interface IBenhAnDAO {

    boolean insert(BenhAn ba);

    boolean update(BenhAn ba);

    boolean delete(int id);

    BenhAn findById(int id);

    List<BenhAn> getAll();
}
