package Model;

import java.time.LocalDate;

public class BenhAn {
    private int id;
    private int lichHenId;   // quan trọng
    private String chanDoan;
    private String phuongPhapDieuTri;
    private String ghiChu;
    private LocalDate ngayTao;

    public BenhAn() {}

    public BenhAn(int id, int lichHenId, String chanDoan,
                  String phuongPhapDieuTri, String ghiChu, LocalDate ngayTao) {
        this.id = id;
        this.lichHenId = lichHenId;
        this.chanDoan = chanDoan;
        this.phuongPhapDieuTri = phuongPhapDieuTri;
        this.ghiChu = ghiChu;
        this.ngayTao = ngayTao;
    }

    public int getId() {
        return id;
    }

    public int getLichHenId() {
        return lichHenId;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public String getPhuongPhapDieuTri() {
        return phuongPhapDieuTri;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLichHenId(int lichHenId) {
        this.lichHenId = lichHenId;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setPhuongPhapDieuTri(String phuongPhapDieuTri) {
        this.phuongPhapDieuTri = phuongPhapDieuTri;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    // getter setter
}
