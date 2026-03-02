package Model;

public class SuDung {
    private int id;   // thêm
    private int hoaDonId;
    private int dichVuId;
    private int soLuong;
    private double donGia;

    public SuDung() {}

    public SuDung(int id, int hoaDonId, int dichVuId, int soLuong, double donGia) {
        this.id = id;
        this.hoaDonId = hoaDonId;
        this.dichVuId = dichVuId;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // getter setter
}
