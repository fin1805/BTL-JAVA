package Model;

public class SuDung {

    private int hoaDonId;
    private int dichVuId;
    private int soLuong;
    private double donGia;

    public SuDung() {}

    public SuDung(int hoaDonId, int dichVuId,
                  int soLuong, double donGia) {
        this.hoaDonId = hoaDonId;
        this.dichVuId = dichVuId;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getHoaDonId() {
        return hoaDonId;
    }

    public void setHoaDonId(int hoaDonId) {
        this.hoaDonId = hoaDonId;
    }

    public int getDichVuId() {
        return dichVuId;
    }

    public void setDichVuId(int dichVuId) {
        this.dichVuId = dichVuId;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // getter setter
}
