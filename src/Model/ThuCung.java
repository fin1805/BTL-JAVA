package Model;

public class ThuCung {
    private int id;
    private String ten;
    private String loai;
    private String giong;
    private int tuoi;
    private int khachHangId;

    public ThuCung() {}

    public ThuCung(int id, String ten, String loai, String giong, int tuoi, int khachHangId) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.giong = giong;
        this.tuoi = tuoi;
        this.khachHangId = khachHangId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public String getLoai() { return loai; }
    public void setLoai(String loai) { this.loai = loai; }

    public String getGiong() { return giong; }
    public void setGiong(String giong) { this.giong = giong; }

    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public int getKhachHangId() { return khachHangId; }
    public void setKhachHangId(int khachHangId) { this.khachHangId = khachHangId; }

    @Override
    public String toString() {
        return ten;
    }
}
