package Model;

public class BacSi {
    private int id;
    private String hoTen;
    private String chuyenMon;
    private String soDienThoai;

    public BacSi() {}

    public BacSi(int id, String hoTen, String chuyenMon, String soDienThoai) {
        this.id = id;
        this.hoTen = hoTen;
        this.chuyenMon = chuyenMon;
        this.soDienThoai = soDienThoai;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getChuyenMon() { return chuyenMon; }
    public void setChuyenMon(String chuyenMon) { this.chuyenMon = chuyenMon; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    @Override
    public String toString() {
        return hoTen;
    }
}
