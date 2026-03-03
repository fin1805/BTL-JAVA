package Dao.ThuCung;

import Model.ThuCung;

import java.util.List;

public interface IThuCungDAO {

    boolean insert(ThuCung tc);

    boolean update(ThuCung tc);

    boolean delete(int id);

    ThuCung findById(int id);

    List<ThuCung> getAll();
}
