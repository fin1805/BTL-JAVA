package Model;

import java.time.LocalDateTime;

public class TaiKhoan {

    private int id;
    private String username;
    private String password;
    private String hoTen;
    private String vaiTro; // ADMIN, BACSI, NHANVIEN
    private boolean trangThai; // true = hoạt động, false = khóa
    private LocalDateTime ngayTao;

    // Constructor rỗng
    public TaiKhoan() {
    }

    // Constructor đầy đủ
    public TaiKhoan(int id, String username, String password, String hoTen,
                    String vaiTro, boolean trangThai, LocalDateTime ngayTao) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    // ================= GETTER & SETTER =================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }


    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }


    public LocalDateTime getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDateTime ngayTao) {
        this.ngayTao = ngayTao;
    }

    // ================= toString =================
    @Override
    public String toString() {
        return hoTen + " (" + vaiTro + ")";
    }
}
