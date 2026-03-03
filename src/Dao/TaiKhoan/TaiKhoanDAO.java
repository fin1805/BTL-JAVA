package Dao.TaiKhoan;

import Model.TaiKhoan;

import java.util.List;

public interface TaiKhoanDAO {

    boolean insert(TaiKhoan tk);

    boolean update(TaiKhoan tk);

    boolean delete(int id);

    TaiKhoan findById(int id);

    List<TaiKhoan> getAll();

    TaiKhoan checkLogin(String username, String password);
}
