package Model;

import java.time.LocalDate;

public class HoaDon {
    private int id;
    private int benhAnId;
    private LocalDate ngayLap;
    private double tongTien;
    private String trangThaiThanhToan; // Da thanh toan / Chua thanh toan

    public HoaDon() {}

    public HoaDon(int id, int benhAnId, LocalDate ngayLap,
                  double tongTien, String trangThaiThanhToan) {
        this.id = id;
        this.benhAnId = benhAnId;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    // getter setter
}
