package Dao.BacSi;

import Model.BacSi;

import java.util.List;

public interface IBacSiDAO {

    boolean insert(BacSi bs);

    boolean update(BacSi bs);

    boolean delete(int id);

    BacSi findById(int id);

    List<BacSi> getAll();
}
