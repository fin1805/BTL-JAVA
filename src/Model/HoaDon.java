package Model;

import java.time.LocalDate;

public class HoaDon {

    private int id;
    private int lichHenId;
    private LocalDate ngayLap;
    private double tongTien;
    private String trangThai;

    public HoaDon() {}

    public HoaDon(int id, int lichHenId, LocalDate ngayLap,
                  double tongTien, String trangThai) {
        this.id = id;
        this.lichHenId = lichHenId;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getLichHenId() {
        return lichHenId;
    }

    public void setLichHenId(int lichHenId) {
        this.lichHenId = lichHenId;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    // getter setter đầy đủ
}
