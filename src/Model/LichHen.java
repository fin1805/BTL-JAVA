package Model;

import java.time.LocalDateTime;

public class LichHen {
    private int id;
    private int thuCungId;
    private int bacSiId;
    private LocalDateTime thoiGian;
    private String lyDoKham;
    private String trangThai;
    private String ghiChu;

    public LichHen() {}

    public LichHen(int id, int thuCungId, int bacSiId, LocalDateTime thoiGian,
                   String lyDoKham, String trangThai, String ghiChu) {
        this.id = id;
        this.thuCungId = thuCungId;
        this.bacSiId = bacSiId;
        this.thoiGian = thoiGian;
        this.lyDoKham = lyDoKham;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThuCungId() {
        return thuCungId;
    }

    public void setThuCungId(int thuCungId) {
        this.thuCungId = thuCungId;
    }

    public int getBacSiId() {
        return bacSiId;
    }

    public void setBacSiId(int bacSiId) {
        this.bacSiId = bacSiId;
    }

    public LocalDateTime getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDateTime thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getLyDoKham() {
        return lyDoKham;
    }

    public void setLyDoKham(String lyDoKham) {
        this.lyDoKham = lyDoKham;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
