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
}
