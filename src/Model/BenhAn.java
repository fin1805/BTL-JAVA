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

    // getter setter
}
